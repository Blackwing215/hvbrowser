package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.Reference;
import by.bsu.hvbrowser.db.entity.Vcf;

public class ReferenceParser extends HeaderChain {

	public ReferenceParser() {
		this.pattern = Pattern.compile("##reference=((.*\\/)?(.*))");
	}
	
	@Override
	protected boolean parse(String source, Vcf vcf) {
		this.matcher = pattern.matcher(source);
		if(matcher.matches()) {
			Reference ref = new Reference();
			
			ref.setName(matcher.group(3));
			ref.setPath(matcher.group(1));
			ref.addVcf(vcf);
			
			vcf.setReference(ref);
			
		}
		return false;
	}
}
