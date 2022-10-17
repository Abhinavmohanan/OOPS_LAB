import java.util.Scanner;

class reverseno{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = read.nextInt();
        System.out.println(String.format("Reversed no. is : %d",reverse(num)));
    }

    private static int reverse(int num){
        int dig,rev=0;        
        while(num !=0){
            dig = num%10;
            num /= 10;
            rev = rev * 10 + dig;
        }
        return rev;
    }
}