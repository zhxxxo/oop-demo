package com.example.oopdemo.model;

/**
 * Base class of the inheritance hierarchy used by the demo.
 */
public class Student {

    private final int id;
    private final String name;
    private final String major;
    private final double gpa;

    public Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    /** Polymorphic hook: subclasses override it to describe themselves. */
    public String getLevel() {
        return "Undergraduate";
    }

    public String describe() {
        return String.format("#%d %s | %s | %s | GPA %.2f", id, name, major, getLevel(), gpa);
    }
}
