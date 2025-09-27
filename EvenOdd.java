import java.util.Scanner;

public class EvenOdd {
    public static void main(Sentence[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! This is a Java demo program.");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) 
        {
            System.out.println(n + " is even.");
        } 
        else 
        {
            System.out.println(n + " is odd.");
        }

        System.out.println("Counting from 1 to " + n + ":");
       
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}

