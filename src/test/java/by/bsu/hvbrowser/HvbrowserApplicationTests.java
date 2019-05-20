package by.bsu.hvbrowser;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import by.bsu.hvbrowser.db.configuration.DBConfiguration;
import by.bsu.hvbrowser.db.entity.Patient;
import by.bsu.hvbrowser.db.services.PatientService;

@RunWith(SpringRunner.class) 
@SpringBootTest(classes = {HvbrowserApplication.class})//, DBConfiguration.class}) 
@Transactional
public class HvbrowserApplicationTests {

//	@Test
//	public void contextLoads() {
//	}
	
	@Autowired
	private PatientService service;
	
	@Test
	public void dbTest() {
		Patient p = new Patient();
		p.setIdPatient(322);
		p.setFirstName("Peter");
		p.setLastName("Petrov");
		p.setBirthdate(new Date(1558355553107L));
		
		service.addOrUpdate(p);
		Patient pActual = service.findById(p.getId());
		
		assertEquals(p, pActual);
	}

}
