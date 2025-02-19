package com.bridgelabz.csv_data_handling.advanced_problems.merge_two_csv_files;

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;
    private String grade;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toCSV() {
        return id + "," + name + "," + age + "," + marks + "," + grade;
    }
}