package models;

public class ChildClass extends ParentClass{
    //child class must override all the method without body from parent class
    void methodWithoutBody() {
        System.out.println("This is method defined in chld class");
    }
}
