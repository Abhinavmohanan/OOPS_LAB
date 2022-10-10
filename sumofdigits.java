import java.util.Scanner;

class sumofdigits{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = read.nextInt();
        System.out.println(String.format("Sum of digits is : %d",sumofdigits(num)));
    }

    private static int sumofdigits(int num){
        int dig,sum=0;        
        while(num !=0){
            dig = num%10;
            num /= 10;
            sum += dig;
        }
        return sum;
    }
}