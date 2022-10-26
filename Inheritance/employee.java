import java.io.*;
import java.util.Scanner;


class employee{
     String name;
     String address;
     String ph;
     int age;
     int salary;

    void printSalary(){
        System.out.println(this.salary);
     }

    static void readEmployee(employee p){
        String type;
        if(p instanceof officer){
            type = "Officer";
        }
        else{
            type = "Manager";
        }
        Scanner read = new Scanner(System.in);
        System.out.println(String.format("Enter name,age,ph,address,salary of %s : ",type));
        p.name = read.nextLine();
        p.age = read.nextInt();
        String drop = read.nextLine();
        p.ph = read.nextLine();
        p.address = read.nextLine();
        p.salary = read.nextInt();
    }

    static void printEmployee(employee p){
        System.out.println(String.format("\nName: %s \nAge: %d \nPhone: %s \nAddress: %s \nSalary: %d \nType: %s",p.name,p.age,p.ph,p.address,p.salary,p.getClass().getName()));
    }

    public static void main(String args[]){
        officer p1 = new officer();
        manager p2 = new manager();
        readEmployee(p1);
        readEmployee(p2);
        System.out.println("List of Employees: \n");
        printEmployee(p1);
        printEmployee(p2);
        System.out.println(Runtime.getRuntime().totalMemory());
        p1=null;
        p2 =null;
        System.out.println(Runtime.getRuntime().totalMemory());
     }
}

class officer extends employee{
    String specialization;
}

class manager extends employee{
    String dept;
}
