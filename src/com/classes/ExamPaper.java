package com.classes;

public class ExamPaper {

    //Aggregation of class into a variable
    private Student student;
    private Subject subject;
    private int marks;


    //constructor
    public ExamPaper(Student student, Subject subject, int marks){
        this.student = new Student(student);
        this.subject = new Subject(subject);
        this.marks = marks;
    }


    //getter & setters


    public Student getStudent() {
        return new Student(student);
    }

    public void setStudent(Student student) {
        this.student = new Student(student);
    }

    public Subject getSubject() {
        return new Subject(subject);
    }

    public void setSubject(Subject subject) {
        this.subject = new Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString(){
        return "Exam Info:\n" + student + subject + "\nMarks: " + marks;
    }
}
