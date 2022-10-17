import java.util.Scanner;

class Frequency{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter String :");
        String string = read.nextLine();
        char str[] = string.toCharArray();
        int freq=0;
        System.out.println("Enter Character :");
        char c = read.next().charAt(0);
        int j = str.length;
        for(int i=0 ; i < j ; i++){
            if(str[i] == c){
               freq++;
            }

            // if(Character.toLowerCase(str[i]) == Character.toLowerCase(c)){
            //     freq++;
            // }
        }
        System.out.println(String.format("Frequency of %c in '%s' is %d",c,string,freq));
    }
}