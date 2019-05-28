package by.bsu.hvbrowser.parser.modules;

import org.springframework.stereotype.Component;

import by.bsu.hvbrowser.db.entity.Vcf;
import by.bsu.hvbrowser.parser.modules.headerchain.*;

@Component
public class HeaderParser {
	
	public Vcf parseLine(String line, Vcf vcf) {
		FileFormatParser fileFormatParser = new FileFormatParser();
		
		fileFormatParser
		.setNext(new FileDateParser())
		.setNext(new FilterParser())
		.setNext(new FormatFieldParser())
		.setNext(new InfoFieldParser())
		.setNext(new ContigParser())
		.setNext(new ReferenceParser());
		
		fileFormatParser.execute(line, vcf);
		
		return vcf;
	}

}
