package by.bsu.hvbrowser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication 
//@Configuration 
@EnableJpaRepositories(basePackages = {"by.bsu.hvbrowser.db.repository"}) 
//@ComponentScan(basePackages = "by.bsu.*") 
public class HvbrowserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HvbrowserApplication.class, args);
	}

}
