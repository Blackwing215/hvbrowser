package by.bsu.hvbrowser.db.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.entity.Patient;
import by.bsu.hvbrowser.db.repository.PatientRepository;
import by.bsu.hvbrowser.db.services.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository repository;

	@Override	
	public Patient addOrUpdate(Patient patient) {
		return repository.save(patient);
	}

	@Override
	public Patient findById(int id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(Patient patient) {
		repository.delete(patient);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
