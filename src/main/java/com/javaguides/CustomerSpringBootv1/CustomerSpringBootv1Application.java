package com.javaguides.CustomerSpringBootv1;

import com.javaguides.CustomerSpringBootv1.entity.customer;
import com.javaguides.CustomerSpringBootv1.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerSpringBootv1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSpringBootv1Application.class, args);
	}

	@Autowired
	private repository Repository;
	@Override
	public void run(String... args) throws Exception {

		customer Cus1= new customer();
		Cus1.setFirst_name(" john");
		Cus1.setLast_name("Mboya");
		Cus1.setAddress("mboya@gmail.com");
		Cus1.setContact("0655354311");

		Repository.save(Cus1);

		customer Cus2= new customer();
		Cus2.setFirst_name("amani ");
		Cus2.setLast_name("cyril");
		Cus2.setAddress("amani@gmail.com");
		Cus2.setContact("0655354111");
		Repository.save(Cus2);





	}
}
