import java.util.Scanner;

class sumofnum{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = read.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = read.nextInt();
        System.out.println(String.format("Sum of entered numbers is : %d",(num1+num2)));
    }
}