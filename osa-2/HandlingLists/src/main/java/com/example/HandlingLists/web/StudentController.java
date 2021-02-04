package com.example.HandlingLists.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.HandlingLists.domain.Student;

@Controller
public class StudentController {
	@GetMapping("/studentlist")
	public String hello(Model model) {
		Student student1 = new Student("Kate", "Cole");
		Student student2 = new Student("Dan", "Brown");
		Student student3 = new Student("Mike", "Mars");

		List<Student> students = new ArrayList<>();

		students.add(student1);
		students.add(student2);
		students.add(student3);

		model.addAttribute("students", students);
		return "studentlist";
	}
}
