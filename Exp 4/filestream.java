import java.io.*;

public class filestream {
    public static void main(String[] args) {
        int ch;
        String str = "";
        FileInputStream f = null;
        try {
            f = new FileInputStream("new.txt");
            while ((ch = f.read()) != -1) {
                str += (char) ch;
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e);
        }

        FileOutputStream fw = null;
        try {
            fw = new FileOutputStream("output.txt");
            byte b[] = str.getBytes();
            fw.write(b);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
