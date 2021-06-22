package models;

import callback.SalaryChangeListener;

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


    public void changeSalary(int salary, SalaryChangeListener listener) {

        this.salary += salary;
        if(salary > 0){
            // notify salary increased
            if (listener != null){
                listener.onSalaryChanged("You salary is increased by " + salary);
            }
        }else{
            if (listener != null){
                listener.onSalaryChanged("You salary is decreased by " + salary);
            }
            // notify salary decreased
        }
        //
    }

    @Override
    public String toString() {
        return "models.Employee{" +
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
