package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.FormatField;
import by.bsu.hvbrowser.db.entity.Vcf;

public class FormatFieldParser extends HeaderChain {
	
	public FormatFieldParser() {
		this.pattern = Pattern.compile("##(FORMAT=<"
				+ "ID=([A-Za-z]*),"					//group 2
				+ "Number=(\\d*\\w*[.]?),"			//group 3
				+ "Type=(\\w*),"					//group 4
				+ "Description=\"(.*)\">)");		//group 5
	}
	
	@Override
	public boolean parse(String source, Vcf vcf) {
		this.matcher = this.pattern.matcher(source);
		if(matcher.matches()) {
			FormatField formatField = new FormatField();
			
			formatField.setId(matcher.group(2));
			formatField.setNumber(matcher.group(3));
			formatField.setType(matcher.group(4));
			formatField.setDescription(matcher.group(5));
			
			vcf.addFormatField(formatField);
			
			return true;
		} else
			return false;
	}
}
