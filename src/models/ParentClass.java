package models;

public abstract class ParentClass {
    abstract void methodWithoutBody();

   public void methodWithBody(){
        System.out.println("This is body of method defined in parent claass");
        //you can call abstract method from here
        //this will call the method defined in child class
        methodWithoutBody();
    }
}

