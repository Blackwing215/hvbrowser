package by.bsu.hvbrowser.db.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import by.bsu.hvbrowser.db.entity.Variant;
import by.bsu.hvbrowser.db.repository.VariantRepository;
import by.bsu.hvbrowser.db.services.VariantService;

@Service
public class VariantServiceImpl implements VariantService{

	@Autowired
	private VariantRepository repository;

	@Override
	public Variant addOrUpdate(Variant variant) {
		return repository.save(variant);
	}

	@Override
	public Variant findById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(Variant variant) {
		repository.delete(variant);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	
}
