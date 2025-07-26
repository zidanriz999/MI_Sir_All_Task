import java.util.Scanner;

public class TheatrrSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long m = sc.nextLong();
    long a = sc.nextLong();

    long rows = (n + a - 1) / a;
    long cols = (m + a - 1) / a;

    System.out.println(rows * cols);
  }
}
