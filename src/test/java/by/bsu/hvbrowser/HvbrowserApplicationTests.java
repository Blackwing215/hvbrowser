package by.bsu.hvbrowser;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.configuration.DBConfiguration;
import by.bsu.hvbrowser.db.entity.Patient;
import by.bsu.hvbrowser.db.entity.Reference;
import by.bsu.hvbrowser.db.entity.Variant;
import by.bsu.hvbrowser.db.entity.Vcf;
import by.bsu.hvbrowser.db.services.PatientService;
import by.bsu.hvbrowser.db.services.ReferenceService;
import by.bsu.hvbrowser.db.services.VariantService;
import by.bsu.hvbrowser.db.services.VcfService;

@RunWith(SpringRunner.class) 
@SpringBootTest(classes = {HvbrowserApplication.class})//, DBConfiguration.class}) 
//@PersistenceContext(type = PersistenceContextType.EXTENDED)
@Transactional
public class HvbrowserApplicationTests {

//	@Test
//	public void contextLoads() {
//	}
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private VcfService vcfService;
	
	@Autowired
	private ReferenceService refService;
	
	@Autowired
	private VariantService varService;
	
	@Autowired
	private EntityManager em;
	
	@Test
	@Rollback(false)
	public void dbTest() {
		Patient p = new Patient();
		Vcf vcf = new Vcf(); 
		Reference ref = new Reference();
		Variant var = new Variant();
		
		var.setId(322);
		var.setChrom("1");
		var.setAlt("A");
		var.setRef("C");
		
//		ref.setId(322);
		ref.setName("TestRef");
		ref.setPath("test/path");
		
		p.setId(322);
		p.setFirstName("Peter");
		p.setLastName("Petrov");
		p.setBirthdate(new Date(1558355553107L));
		
		vcf.setIdVCF("TEST0001");
//		vcf.setReference(ref);
		vcf.setPatient(p);
		vcf.setFileDate(new Date(0L));
		vcf.setFileFormat("test");
		
//		p.addVcf(vcf);
		ref.addVcf(vcf);
		vcf.addVariant(var);
		var.addVcf(vcf);
		
//		patientService.addOrUpdate(p);
//		refService.addOrUpdate(ref);
		vcfService.addOrUpdate(vcf);
		varService.addOrUpdate(var);
		 
//		Patient pActual = patientService.findById(p.getId());
//		Reference refActual = refService.findById(ref.getId());
		Vcf vcfActual = vcfService.findById(vcf.getId());
//		Reference refActual = vcfActual.getReference();
//		Patient pActual = vcf.getPatient();
//		Vcf vcfFromRef = refActual.getVcfFiles().get(0);
		Variant varActual = varService.findById(var.getId());
		
		System.out.println(varActual);
//		System.out.println(vcfFromP.getFileFormat());
//		assertEquals(p, pActual);
//		assertEquals(ref, refActual);
//		assertEquals(vcf, vcfActual);
		
//		vcfService.deleteById(vcf.getId());
//		refService.deleteById(ref.getId());
//		patientService.deleteById(p.getId());
	}

}
