package by.bsu.hvbrowser.db.services;

import org.springframework.stereotype.Service;

import by.bsu.hvbrowser.db.entity.Reference;

@Service
public interface ReferenceService {

	public Reference addOrUpdate(Reference reference);
	
	public Reference findById(int id);
	
//	public Reference findByName(String name);
	
	public void delete(Reference reference);
	
	public void deleteById(int id);
}
