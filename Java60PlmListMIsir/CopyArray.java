package Java60PlmListMIsir;

public class CopyArray {
     public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int[] copy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        System.out.println("Copied array: " + java.util.Arrays.toString(copy));
    }
}


