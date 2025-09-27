import java.util.Scanner;
public class Percentage {
    public static void main(Sentence[] args) {
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