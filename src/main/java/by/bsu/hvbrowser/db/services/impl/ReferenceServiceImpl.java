package by.bsu.hvbrowser.db.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.entity.Reference;
import by.bsu.hvbrowser.db.repository.ReferenceRepository;
import by.bsu.hvbrowser.db.services.ReferenceService;

@Service
@Transactional
public class ReferenceServiceImpl implements ReferenceService{

	@Autowired
	private ReferenceRepository repository;

	@Override
	public Reference addOrUpdate(Reference reference) {
		return repository.save(reference);
	}

	@Override
	public Reference findById(int id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(Reference reference) {
		repository.delete(reference);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

//	@Override
//	public Reference findByName(String name) {
//		return repository.fi;
//	}
}
