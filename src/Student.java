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
        System.out.println("Student constructor");
    }

    public void display(){
        super.display();
        System.out.println("This is display method from student");
    }


    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", collegeName='" + collegeName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", joined='" + joined + '\'' +
                '}';
    }
}
