package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String firstLine, String city) {
}

record Person(String name, int age, Address address) {
}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Eve";
	}

	@Bean
	public int age() {
		return 44;
	}
	
	@Bean
	public Person person5Qualifier(String name , int age , @Qualifier("workAdressqualifier") Address address) {
		return new Person(name, age, address);
	}
	
	
	@Bean
	public Person person3Parameters(String name , int age , Address workAddress) {
		return new Person(name, age, workAddress);
	}


	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person() {
		return new Person("Bekir", 22, new Address("Main Street", "Ultrecth"));
	}

	@Bean(name = "homeAddress")
	@Primary
	public Address address() {
		return new Address("Hasan Basri Cad", "İstanbul");
	}
	
	@Bean(name = "workAddress")
	@Qualifier("workAdressqualifier")
	public Address address2() {
		return new Address("Digital Teknokent", "İstanbul");
	}


}
