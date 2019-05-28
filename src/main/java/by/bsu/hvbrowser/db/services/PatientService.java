package by.bsu.hvbrowser.db.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.entity.Patient;

@Service
@Transactional
public interface PatientService {
	
	
	public Patient addOrUpdate(Patient patient);
	
	public Patient findById(int id);
	
	public void delete(Patient patient);
	
	public void deleteById(int id);
}
