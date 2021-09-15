package models;

import java.util.Objects;

public class Student extends Person { //student is a person

    String collegeName;
    String faculty;
    String joined;
    public Student(){
        this.id = 1;
        this.name ="name";
        this.gender = "female";
        this.age = 29;
//        this.display();
//        this.age = 20;
        this.collegeName = "KCMIT";
        this.faculty = "Mangement";
        this.joined = "2012";
        System.out.println("models.Student constructor");
    }

    public Student( String name, int age, String collegeName) {
        super.name = name;
        super.age = age;
        this.collegeName = collegeName;
    }

    public void display(){
      //  super.display();
        System.out.println("This is display method from student");
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String toString() {
        return this.name + " " + this.age;
    }


}
