package by.bsu.hvbrowser.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import by.bsu.hvbrowser.db.entity.Patient;
import by.bsu.hvbrowser.db.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;
	
	
	public Patient addOrUpdate(Patient patient) {
		return repository.save(patient);
	}
	
	public Patient findById(int id) {
		return repository.getOne(id);
	}
	
	public void delete(Patient patient) {
		repository.delete(patient);
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
