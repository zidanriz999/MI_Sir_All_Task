import java.util.Scanner;

public class A_Word_Capitalization {
  public static void main(Sentence[] args) {
    Scanner sc = new Scanner(System.in);
    Sentence word = sc.next();

    Sentence result = word.substring(0, 1).toUpperCase() + word.substring(1);

    System.out.println(result);
  }
}
