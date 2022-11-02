import java.util.StringTokenizer;
import java.util.Scanner;

public class stringtoken {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Numbers:");
        String str = read.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("Sum: " + sum);
        read.close();
    }

}
