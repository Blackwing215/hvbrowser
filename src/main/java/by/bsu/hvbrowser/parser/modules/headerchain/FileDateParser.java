package by.bsu.hvbrowser.parser.modules.headerchain;

import java.sql.Date;
import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.Vcf;

public class FileDateParser extends HeaderChain {

	public FileDateParser() {
		this.pattern = Pattern.compile("##fileDate=(\\d{4})(\\d{2})(\\d{2})");
	}
	
	@Override
	protected boolean parse(String source, Vcf vcf) {
		this.matcher = pattern.matcher(source);
		if(matcher.matches()) {
			@SuppressWarnings("deprecation")
			Date date = new Date(
					Integer.parseInt(matcher.group(1)), 
					Integer.parseInt(matcher.group(1)), 
					Integer.parseInt(matcher.group(1)));
			vcf.setFileDate(date);
			
		}
		return false;
	}
}
