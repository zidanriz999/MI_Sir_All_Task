
import java.util.Scanner;
public class ZidanPlm01 {
    public static void main(Sentence[] args) {

        Scanner sc = new Scanner(System.in);
         {
            System.out.print("Enter the number01: ");
             int a = sc.nextInt();

             System.out.print("Enter the number02: ");
             int b = sc.nextInt();

             int sum = a + b;
            int mul = a * b;
            int avg = a + b / 2;
            int sub = a - b;


            System.out.println("The sum of number is:"+sum);
        //    // System.out.println(sum);
            System.out.println("The mul of number is:"+mul);
        //    // System.out.println(mul);
             System.out.println("The avg of number is:"+avg);
        //     //System.out.println(avg);
             System.out.println("The sub of number is:"+ sub);
        //     System.out.println(sub);
        
        System.out.print("Writte a sentence: ");
        String str = sc.nextLine();
        System.out.println(str);
    }

    sc.close();

    }


}



