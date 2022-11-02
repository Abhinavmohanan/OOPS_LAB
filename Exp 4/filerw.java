import java.io.*;
import java.util.*;

class filerw {
    public static void main(String[] args) {
        int ch;
        Scanner read = new Scanner(System.in);
        try {
            FileWriter f = new FileWriter("new.txt");
            System.out.println("Enter String to write:");
            String str = read.nextLine();
            f.write(str);
            f.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        read.close();
        FileReader f = null;
        try {
            f = new FileReader("new.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            System.out.println("String read : ");
            while ((ch = f.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException j) {
            System.out.println(j);
        }

    }

}
