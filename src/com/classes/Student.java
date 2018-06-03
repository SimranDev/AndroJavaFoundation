package com.classes;

public class Student {

    public String studentName;
    public long studentNumber;

    public Student(String studentName, long studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }


    public Student(Student copyStudent){
        this.studentName = copyStudent.studentName;
        this.studentNumber = copyStudent.studentNumber;
    }


    public boolean equals(Student object) {
        return (this.studentName.equals(object.studentName)  && this.studentNumber == object.studentNumber);
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }


    @Override
    public String toString(){
        return "Student Info:\n" + "Student Name: "+ studentName + "\nStudent Number: " + studentNumber;
    }
}
