package Java60PlmListMIsir;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int max = numbers[0], min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}


