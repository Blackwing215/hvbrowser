package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.Filter;
import by.bsu.hvbrowser.db.entity.Vcf;

public class FilterParser extends HeaderChain {

	public FilterParser() {
		this.pattern = Pattern.compile("##(FILTER=<"
				+ "ID=([A-Za-z]*),"					//group 2
				+ "Description=\"(.*)\">)");		//group 3
	}
	
	@Override
	public boolean parse(String source, Vcf vcf) {
		this.matcher = this.pattern.matcher(source);
		if(matcher.matches()) {
			Filter filter = new Filter();
			
			filter.setId(matcher.group(2));
			filter.setDescription(matcher.group(3));
			
			vcf.addFilter(filter);
			
			return true;
		} else
			return false;
	}
}
