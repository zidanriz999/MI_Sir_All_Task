import java.util.Scanner;

public class BearAndBrother {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int limak = scanner.nextInt();
    int bob = scanner.nextInt();

    int years = 0;

    while (limak <= bob)

    {
      limak = limak * 3;
      bob = bob * 2;
      years = years + 1;
    }

    System.out.println(years);
  }
}
