import java.util.Scanner;

public class Insertion3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] array = new int[6];

    for (int j = 0; j < 5; j++) {
      int data = input.nextInt();
      array[j] = data;
    }

    for (int i = 5; i > 2; i--) {
      array[i] = array[i - 1];
    }

    array[2] = 6;

    for (int j = 0; j < 6; j++) {
      System.out.println(array[j]);
    }

  }
}