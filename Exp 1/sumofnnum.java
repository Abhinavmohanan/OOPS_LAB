import java.util.Scanner;

class sumofnnum{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = read.nextInt(),sum = 0,i;
        for(i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(String.format("Sum of first %d number is : %d",n,sum));
    }
}