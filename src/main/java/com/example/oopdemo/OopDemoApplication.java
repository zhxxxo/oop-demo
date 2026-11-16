package com.example.oopdemo;

import com.example.oopdemo.model.Student;
import com.example.oopdemo.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopDemoApplication.class, args);
	}

	/** Prints a short OOP report right after the context is ready. */
	@Bean
	CommandLineRunner startupReport(StudentService studentService) {
		return args -> {
			System.out.println();
			System.out.println("==============================================");
			System.out.println("  OOP Demo - startup report");
			System.out.println("==============================================");
			for (Student s : studentService.findAll()) {
				// describe() resolves against the real runtime type, so a
				// GraduateStudent also prints its thesis: dynamic dispatch.
				System.out.println("  " + s.describe());
			}
			System.out.println("==============================================");
			System.out.println("  Index page    : http://localhost:8080/");
			System.out.println("  Students page : http://localhost:8080/students.html");
			System.out.println("  REST endpoint : http://localhost:8080/api/students");
			System.out.println("==============================================");
			System.out.println();
		};
	}

}
