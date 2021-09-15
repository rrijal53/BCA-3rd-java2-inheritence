import models.Student;

import java.util.*;

class SwitchCase {
    public static void main(String[] args) {
        char c;
        String name, address;
        int age;
        List<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("choose\n1 for adding data to the list\n2 for deleting data in the list \n3 for displaying a list\n4 for exiting ");
            c = sc.next().charAt(0);
            try {
                switch (c) {
                    case '1':
                        System.out.println("enter name age and address: ");
                        name = sc.next();
                        age = sc.nextInt();
                        address = sc.next();
                        Student s = new Student(name, age, address);
                        list.add(s);
                        break;
                    case '2':
                        System.out.println("enter name age and address: ");
                        name = sc.nextLine();
                        age = sc.nextInt();
                        address = sc.nextLine();
                        Student s1 = new Student(name, age, address);
                        list.removeIf(s2 -> s2.getCollegeName().equals(s1.getCollegeName()));
                        break;
                    case '3':
                        for (Student s2 : list) {
                            System.out.println(s2);
                        }
                }
                if (c == '4')
                    break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}