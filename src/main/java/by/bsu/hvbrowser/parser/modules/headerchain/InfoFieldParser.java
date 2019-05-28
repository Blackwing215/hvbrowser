package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.InfoField;
import by.bsu.hvbrowser.db.entity.Vcf;

public class InfoFieldParser extends HeaderChain {
	
	public InfoFieldParser() {
		this.pattern = Pattern.compile("##(INFO=<"
				+ "ID=([A-Za-z]*),"					//group 2
				+ "Number=(\\d*\\w*[.]?),"			//group 3
				+ "Type=(\\w*),"					//group 4
				+ "Description=\"(.*)\">)");		//group 5
	}
	
	@Override
	public boolean parse(String source, Vcf vcf) {
		this.matcher = this.pattern.matcher(source);
		if(matcher.matches()) {
			InfoField infoField = new InfoField();
			
			infoField.setId(matcher.group(2));
			infoField.setNumber(matcher.group(3));
			infoField.setType(matcher.group(4));
			infoField.setDescription(matcher.group(5));
			
			vcf.addInfoField(infoField);
			
			return true;
		} else
			return false;
	}
}
