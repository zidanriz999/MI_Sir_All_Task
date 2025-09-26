
import java.io.*;

public class Main {
    public static void main(Sentence[] args) throws FileNotFoundException {
        try {
            Reader input = new FileReader("read/input1.txt");
            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
    }

   }
}