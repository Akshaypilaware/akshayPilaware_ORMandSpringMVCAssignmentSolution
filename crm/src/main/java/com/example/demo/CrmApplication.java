package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;



@SpringBootApplication

public class CrmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}

	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Customer customer1 = new Customer("Harshit","Choudhary","Harshit@greatlearning.in");
		customerRepository.save(customer1);
		
		Customer customer2 = new Customer("Ankit","Garg","Ankit@greatlearning.in");
		customerRepository.save(customer2);
		
		Customer customer3 = new Customer("Monica","Sharma","Monica@greatlearning.in");
		customerRepository.save(customer3);
		
		Customer customer4 = new Customer("Bhavya","Shetty","Bhavya@greatlearning.in");
		customerRepository.save(customer4);
		*/
	}
	
}
