package com.example.oopdemo.controller;

import com.example.oopdemo.model.Student;
import com.example.oopdemo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Map<String, Object>> students() {
        return studentService.findAll().stream()
                .map(s -> Map.<String, Object>of(
                        "id", s.getId(),
                        "name", s.getName(),
                        "major", s.getMajor(),
                        "gpa", s.getGpa(),
                        "level", s.getLevel(),
                        "summary", s.describe()))
                .toList();
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "app", "oop-demo");
    }
}
