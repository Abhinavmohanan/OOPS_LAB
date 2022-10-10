import java.util.Scanner;

class dtob{

    private static String dectobin(int dec){
        int dig;
        String bin="";
        while(dec != 0){
            dig = dec%2;
            dec /= 2;
            bin += dig;
        }   
        return bin;
    }

    public static void main(String args[]){
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the decimal number: ");
        int dec = read.nextInt();
        String bin = dectobin(dec);
        System.out.println("Binary version is :");
        for(int i= bin.length() -1; i>=0;i--){
            System.out.print(bin.charAt(i));
        }
        System.out.println();
    }
}