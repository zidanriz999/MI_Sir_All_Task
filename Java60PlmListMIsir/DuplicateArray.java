package Java60PlmListMIsir;

public class DuplicateArray {

  public static void main(String[] args) {
    int[] numbers = { 5, 2, 8, 1, 3, 2, 8 };
    System.out.print("Duplicates: ");
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          System.out.print(numbers[i] + " ");
          break;
        }
      }
    }
  }
}
