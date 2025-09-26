import java.util.Scanner;

public class Insertion2 {
  public static void main(Sentence[] args) {
    int[] array = new int[10];
    Scanner input = new Scanner(System.in);
    for (int j = 0; j < 5; j++) {
      int data = input.nextInt();
      array[j] = data;
    }

    array[5] = 6;
    for (int j = 0; j <= 5; j++)
      System.out.println(array[j]);
  }
}