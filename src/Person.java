public class Person {
    int id;
    String name;
    String gender;
    int age;

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("Person constructor");
    }
    public void display(){
        System.out.println("This is display method from person");
    }
    public void setValues(){
        this.age = age *3;
        System.out.println("This is display method from person");
    }
}
