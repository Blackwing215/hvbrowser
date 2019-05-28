package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.Contig;
import by.bsu.hvbrowser.db.entity.Vcf;

public class ContigParser extends HeaderChain {
	
	public ContigParser() {
		this.pattern = Pattern.compile("##(contig=<"
				+ "ID=(.*),"				//group 2
				+ "length=(\\d*),"			//group 3
				+ "assembly=(.*)>)");		//group 4
	}
	
	@Override
	public boolean parse(String source, Vcf vcf) {
		this.matcher = this.pattern.matcher(source);
		if(matcher.matches()) {
			Contig contig = new Contig();
			
			contig.setId(matcher.group(2));
			contig.setLength(Long.parseLong(matcher.group(3)));
			contig.setAssembly(matcher.group(4));
			
			vcf.addContig(contig);
			
			return true;
		} else
			return false;
	}
}
