package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.Vcf;

public class FileFormatParser extends HeaderChain {

	public FileFormatParser() {
		this.pattern = Pattern.compile("##fileformat=(.*)");
	}
	
	@Override
	protected boolean parse(String source, Vcf vcf) {
		this.matcher = pattern.matcher(source);
		if(matcher.matches()) {
			vcf.setFileFormat(matcher.group(1));
			
		}
		return false;
	}
}
