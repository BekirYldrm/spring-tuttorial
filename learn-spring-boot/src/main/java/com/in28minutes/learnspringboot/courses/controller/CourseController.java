package com.in28minutes.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.entity.Course;
import com.in28minutes.learnspringboot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {

		return repository.findAll();

		// return Arrays.asList(new Course(1, "in28minutes", "Learn Micro Services"),
		// new Course(2, "in28minutes", "Learn Java"));
	}

	@GetMapping("/courses/{id}")
	public Course getCourseDetails(@PathVariable long id) {

		var course = repository.findById(id);
		
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id:" + id);
		} else {
			return course.get();
		}

	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course){
		repository.save(course);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course){
		repository.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}

}
