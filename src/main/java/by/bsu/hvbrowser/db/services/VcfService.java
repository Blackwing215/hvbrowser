package by.bsu.hvbrowser.db.services;

import org.springframework.stereotype.Service;

import by.bsu.hvbrowser.db.entity.Vcf;

@Service
public interface VcfService {

	public Vcf addOrUpdate(Vcf vcf);
	
	public Vcf findById(String id);
	
	public void delete(Vcf vcf);
	
	public void deleteById(String id);
}
