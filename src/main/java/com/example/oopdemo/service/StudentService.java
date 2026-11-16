package com.example.oopdemo.service;

import com.example.oopdemo.model.GraduateStudent;
import com.example.oopdemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * In-memory data source. The list mixes both concrete subclasses so the
 * controller and the pages can show polymorphism in action.
 */
@Service
public class StudentService {

    private final List<Student> students = List.of(
            new Student(1, "Chen Wei", "Computer Science", 3.72),
            new Student(2, "Lin Xiaoyu", "Software Engineering", 3.45),
            new Student(3, "Zhao Ming", "Computer Science", 3.91),
            new GraduateStudent(4, "Sun Qi", "Computer Science", 3.88, "Graph Neural Networks"),
            new GraduateStudent(5, "Wang Yue", "Software Engineering", 3.66, "Microservice Governance"));

    public List<Student> findAll() {
        return students;
    }
}
