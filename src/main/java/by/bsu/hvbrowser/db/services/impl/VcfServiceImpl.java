package by.bsu.hvbrowser.db.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.entity.Vcf;
import by.bsu.hvbrowser.db.repository.VcfRepository;
import by.bsu.hvbrowser.db.services.VcfService;

@Service
@Transactional
public class VcfServiceImpl implements VcfService{
	
	@Autowired
	private VcfRepository repository;

	@Override
	public Vcf addOrUpdate(Vcf vcf) {
		return repository.save(vcf);
	}

	@Override
	public Vcf findById(String id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(Vcf vcf) {
		repository.delete(vcf);
	}

	@Override
	public void deleteById(String id) {
		repository.deleteById(id);
	}
}
