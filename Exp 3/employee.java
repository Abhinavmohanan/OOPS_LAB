import java.io.*;
import java.util.Scanner;

class employee {
    String name, address, ph;
    int age;
    int salary;

    void printSalary() {
        System.out.println(this.salary);
    }

    static void readEmployee(employee p1) {
        String type;
        Scanner read = new Scanner(System.in);
        if (p1 instanceof officer) {
            officer p0 = ((officer) p1);
            type = "Officer";
            System.out.println(String.format("Enter name,age,ph,address,salary,specialization of %s : ", type));
            p0.name = read.nextLine();
            p0.age = read.nextInt();
            read.nextLine();
            p0.ph = read.nextLine();
            p0.address = read.nextLine();
            p0.salary = read.nextInt();
            read.nextLine();
            p0.specialization = read.nextLine();
        } else {
            manager p2 = ((manager) p1);
            type = "Manager";
            System.out.println(String.format("Enter name,age,ph,address,salary,department of %s : ", type));
            p2.name = read.nextLine();
            p2.age = read.nextInt();
            read.nextLine();
            p2.ph = read.nextLine();
            p2.address = read.nextLine();
            p2.salary = read.nextInt();
            read.nextLine();
            p2.dept = read.nextLine();
        }
    }

    static void printEmployee(employee p1) {
        if (p1 instanceof officer) {
            officer p = ((officer) p1);
            System.out.println(String.format(
                    "\nName: %s \nAge: %d \nPhone: %s \nAddress: %s \nSalary: %d \nType: %s \nSpecialization:%s",
                    p.name, p.age, p.ph, p.address, p.salary, p.getClass().getName(), p.specialization));
        } else {
            manager p = ((manager) p1);
            System.out.println(String.format(
                    "\nName: %s \nAge: %d \nPhone: %s \nAddress: %s \nSalary: %d \nType: %s \nDepartment:%s",
                    p.name, p.age, p.ph, p.address, p.salary, p.getClass().getName(), p.dept));
        }
    }

    public static void main(String args[]) {
        officer p1 = new officer();
        manager p2 = new manager();
        readEmployee(p1);
        readEmployee(p2);
        System.out.println("List of Employees: \n");
        printEmployee(p1);
        printEmployee(p2);
    }
}

class officer extends employee {
    String specialization;
}

class manager extends employee {
    String dept;
}
