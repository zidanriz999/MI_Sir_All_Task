import java.util.Scanner;

public class SoldierBanana {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int k = input.nextInt();
    int n = input.nextInt();
    int w = input.nextInt();

    int total = 0;

    for (int i = 1; i <= w; i++) 
    {
      total = total + i * k;
    }

    if (total > n) 
    
  {
      System.out.println(total - n);
    } 
    
    else
    {
      System.out.println(0);
    }
  }
}
