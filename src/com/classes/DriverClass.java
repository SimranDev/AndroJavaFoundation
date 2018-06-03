package com.classes;

public class DriverClass {

    public static void main(String[] args) {

        //creating new object
        /* House house = new House(10, 12, "Tiles", "Brick");

        house.setNrOfDoors(7);
        house.setTypeOfRoof("Wood");

        System.out.println("House:");
        System.out.println("Number of Windows: "+ house.getNrOfWindows());
        System.out.println("Number of Doors: "+ house.getNrOfDoors());
        System.out.println("Type of Roof: "+ house.getTypeOfRoof());
        System.out.println("Type of Wall: "+ house.getTypeOfWall()); */


        //creating objects
        Subject subject1 = new Subject("ABC123", "Test Subject");
        Subject subject2 = new Subject("ABC123", "Test Subject");
        Student student1 = new Student("Simran", 10001);
        ExamPaper paper1 = new ExamPaper(student1, subject2, 100);


//
//        if(subject1.equals(subject2)){
//            System.out.println("\nSubjects are same..");
//        }

        System.out.println(paper1);
    }
}
