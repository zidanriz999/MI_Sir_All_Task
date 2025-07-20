import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
          if(w>=4 && w<=100 && w%2==0) 
        
        {
            System.out.println("Yes");
        } 
        
        else 
        {
            System.out.println("NO");
        }
        scanner.close();
    }
}
