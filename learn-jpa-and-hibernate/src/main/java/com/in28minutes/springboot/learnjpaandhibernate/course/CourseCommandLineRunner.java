package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// @Autowired
	// private CourseJdbcRepository repository;

	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1, "learn Spring Data JDBC", "Bekir Yıldırım"));
		repository.save(new Course(2, "learn Spring Java", "Eve"));
		repository.save(new Course(3, "learn Java", "Ragna"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Ragna"));
		
		System.out.println(repository.findByName("learn Spring Java"));

	}

}
