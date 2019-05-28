package by.bsu.hvbrowser.parser.modules.headerchain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.bsu.hvbrowser.db.entity.Vcf;

public abstract class HeaderChain {
	
	protected Pattern pattern;
	protected Matcher matcher;
	protected HeaderChain next;
	
	public HeaderChain setNext(HeaderChain next) {
		this.next = next;
		return this.next;
	}

	public HeaderChain next() {
		return this.next;
	}
	
	public void execute(String source, Vcf vcf) {
		if(!parse(source, vcf) && next != null)
			next.execute(source, vcf);
		else
			return;
				
	}
	
	protected abstract boolean parse(String source, Vcf vcf);
}
