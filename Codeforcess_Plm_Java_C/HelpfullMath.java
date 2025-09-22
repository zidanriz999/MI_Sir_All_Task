import java.util.Arrays;
import java.util.Scanner;

public class HelpfullMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] num = new int[101];
        int c = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) 

            {
                num[c++] = ch - '0';
            }
        }

     
        Arrays.sort(num, 0, c);

      
        for (int i = 0; i < c; i++) 
        
        {
            System.out.print(num[i]);
            if (i < c - 1) 
            
            {
                System.out.print("+");
            }
        }

        sc.close();
    }
}

