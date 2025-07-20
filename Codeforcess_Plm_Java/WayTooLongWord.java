import java.util.Scanner;

public class WayTooLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  

        for (int i = 0; i < x; i++) 
        {
            String s = sc.next();
            int ln = s.length();

            if (ln <= 10) 
            {
                System.out.println(s);
            } 
            
            else 
            {
                System.out.printf("%c%d%c\n", s.charAt(0), ln - 2, s.charAt(ln - 1));
            }
        }

        sc.close();
    }
}
