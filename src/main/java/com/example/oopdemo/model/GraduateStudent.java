package com.example.oopdemo.model;

/**
 * Subclass that reuses the state of Student and overrides its behaviour.
 */
public class GraduateStudent extends Student {

    private final String thesisTopic;

    public GraduateStudent(int id, String name, String major, double gpa, String thesisTopic) {
        super(id, name, major, gpa);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    @Override
    public String getLevel() {
        return "Graduate";
    }

    @Override
    public String describe() {
        return super.describe() + " | thesis: " + thesisTopic;
    }
}
