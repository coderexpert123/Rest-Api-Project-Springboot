package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseServices;




//home classes
@RestController
public class MyController {
	
	@Autowired
	private CourseServices courservice;
	
@GetMapping("/")
public String home() {
	return "this is home";
	
}

// Get all courses
@GetMapping("/courses")
public List<Course> getCourse(){
	return this.courservice.getCourse();
	
		
}
@GetMapping("/courses/{courseId}")
public Course getCourses(@PathVariable String courseId) {
	
	return this.courservice.getCourses(Long.parseLong(courseId));
	
}

@PostMapping("/courses")
public Course addcourse(@RequestBody Course course) {
	
	
	return this.courservice.addcourse(course);
	
	
	
	
}
}
