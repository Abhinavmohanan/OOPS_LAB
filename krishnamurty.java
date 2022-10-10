import java.util.Scanner;
import pack.factorial;

    
class krishnamurty{
    public static void main(String args[]){
    
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = read.nextInt();
        boolean result = krishnamurty(num);
        if(result){
            System.out.println("Krishnamurty no.");
        }
        else{
            System.out.println("Not Krishnamurty no.");
        }
    }

    private static boolean krishnamurty(int n){   
        int dig,sum=0,num=n;  
        factorial fact = new factorial();      
        while(n !=0){
            dig = n%10;
            n /= 10;
            sum += fact.fact(dig);
        }
        System.out.println(num);
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
}