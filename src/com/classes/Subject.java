package com.classes;

public class Subject {

    public String subjectCode;
    public String subjectName;

    //Constructor
    public Subject(String subjectCode, String subjectName){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }


    //Copy Constructor
    public Subject(Subject copyOfSubject){
        this.subjectCode = copyOfSubject.subjectCode;
        this.subjectName = copyOfSubject.subjectName;
    }


    //Getter & Setters
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    //checking if equal or not
    public boolean equals(Subject object){
         return (this.subjectName.equals(object.subjectName) && this.subjectCode.equals(object.subjectCode));
    }


    //toString method
    @Override
    public String toString(){
        return "\nSubject Info:" + "\nSubject Name: " + subjectName + "\nSubject Code: " + subjectCode;
    }


}
