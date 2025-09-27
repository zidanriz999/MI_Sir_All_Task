import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner sc = new Scanner(System.in); 
        String name = sc.nextLine(); 

        System.out.println("Hello Everyone" + "\nMy name is " + name + " Have a Good day!!");

        sc.close(); 
    }
}

