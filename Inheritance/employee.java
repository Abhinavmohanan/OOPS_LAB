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

    // employee(String name,String address,int age,int ph,int salary){
    //     this.name = name;
    //     this.address = address;
    //     this.age = age;
    //     this.ph = ph;
    //     this.salary = salary;
    // }

    static void readEmployee(employee p){
        String type;
        if(p instanceof officer){
            type = "Officer";
        }
        else{
            type = "Manager";
        }
        Scanner read = new Scanner(System.in);
        System.out.println(String.format("Enter name of %s : ",type));
        p.name = read.nextLine();
        System.out.println(String.format("Enter age of %s : ",type));
        p.age = read.nextInt();
        String drop = read.nextLine();
        System.out.println(String.format("Enter ph of %s : ",type));
        p.ph = read.nextLine();
        System.out.println(String.format("Enter address of %s : ",type));
        p.address = read.nextLine();
        System.out.println(String.format("Enter salary of %s : ",type));
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
     }
}

class officer extends employee{
    String specialization;
}

class manager extends employee{
    String dept;
}
