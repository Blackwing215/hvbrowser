package by.bsu.hvbrowser.db.services;

import org.springframework.stereotype.Service;

import by.bsu.hvbrowser.db.entity.Variant;

@Service
public interface VariantService {

	public Variant addOrUpdate(Variant variant);
	
	public Variant findById(Long id);
	
	public void delete(Variant variant);
	
	public void deleteById(Long id);
}
