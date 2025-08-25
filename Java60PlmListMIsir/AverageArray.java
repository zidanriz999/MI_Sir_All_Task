package Java60PlmListMIsir;

public class AverageArray {

  public static void main(String[] args) {
    int[] numbers = { 5, 2, 8, 1, 3 };
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    double average = (double) sum / numbers.length;
    System.out.println("Average: " + average);
  }
}
