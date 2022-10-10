import java.util.Scanner;

class primeno{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = read.nextInt();
        boolean result = prime(num);
        if(result){
            System.out.println("Prime no.");
        }
        else{
            System.out.println("Not prime");
        }
    }

    private static boolean prime(int n){       
        for(int i=2;i<=n/2;i++){
            if((n%i) == 0){
                return false;
            }
        }
        return true;
    }
}