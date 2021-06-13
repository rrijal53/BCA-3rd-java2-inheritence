public class Employee extends  Person{
    double salary;
    String companyName;
    String position;

    public Employee() {
        this.name   =  "Mr ram";
        this.gender   =  "Male";
        this.age   =  30;
        this.salary = 20000;
        this.companyName = "ABC Co";
        this.position = "Programmer";
    }


    public void setValues() {
        super.setValues();
        this.salary = this.salary * 3;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
