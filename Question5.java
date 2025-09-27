//Question 1,2
/*
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 sujbect out of 100");

        int subject1=sc.nextInt();
        int subject2=sc.nextInt();
        int subject3=sc.nextInt();
        int subject4=sc.nextInt();
        int subject5=sc.nextInt();

     int totalMarks=subject1+subject2+subject3+subject4+subject5;
        double percentage=(totalMarks/500.0)*100;

        System.out.println("TotalMarks of 5 subject "+totalMarks+ "marks");
        System.out.println("Percentage is "+percentage+"%");

        sc.close();

    }

}
*/

// Question 3

/*
import java.util.Scanner;
 public class Question5{
     public static void main(String[] args) {
         System.out.println("What is your name?");

         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         System.out.println("Hello Everyone"+"\nMy name is "+name+" Have a Good day!!");

     }

 sc.close();
 }

 */

// Question 4

/*
import java.util.Scanner;
public class Question5{

    public static void main(String[] args) {
        System.out.println("Enter the Value");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }


 sc.close();


}

*/

//Question 5

import java.util.Scanner;

public class Question5 {
    public static void main(Sentence[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        sc.close();
    }
}
