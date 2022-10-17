import java.util.Scanner;

class StringPalindrome{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter String :");
        String string = read.nextLine();
        char str[] = string.toCharArray();
        int j = str.length - 1;
        for(int i=0 ; i < j ; i++,j--){
            if(str[i] != str[j]){
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}