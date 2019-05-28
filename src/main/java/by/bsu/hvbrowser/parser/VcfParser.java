package by.bsu.hvbrowser.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.entity.Vcf;
import by.bsu.hvbrowser.db.services.VcfService;
import by.bsu.hvbrowser.parser.modules.HeaderParser;

public class VcfParser implements Parser {
	
	@Autowired
	private HeaderParser headerParser;

	@Autowired
	private VcfService vcfService;
	
	@Override
	@Transactional
	public void parse(File input) {
		try{
			   FileInputStream fstream = new FileInputStream(input);
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			   Vcf vcf = new Vcf();
			   String header = "";
			   String strLine;
			   while ((strLine = br.readLine()) != null){
				   if(strLine.startsWith("##")) {
					   header += strLine + "\n";
					   headerParser.parseLine(strLine, vcf);
				   } else if (strLine.startsWith("#")) {
					   header += strLine + "\n";
				   } else {
					   
				   }
			   }
			   vcf.setHeader(header);
			   
			   
			   
			   br.close();
			   
			   vcfService.addOrUpdate(vcf);
			   //return vcf;
			}catch (IOException e){
				
			}
	}

}
