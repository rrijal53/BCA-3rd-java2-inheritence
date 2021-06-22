import callback.SalaryChangeListener;
import models.Employee;

public class EmployeeIm implements SalaryChangeListener {
    void run(){
        Employee e = new Employee();
        e.changeSalary(1000,this);
        e.changeSalary(2000, this);
        e.changeSalary(-2000, this);
    }

    public void onSalaryChanged(String message) {
        System.out.println(message);
        //send email, sms
    }
}
