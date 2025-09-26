import java.util.Scanner;

public class A_Bear_and_Big_Brother {
  public static void main(Sentence[] args) {
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
