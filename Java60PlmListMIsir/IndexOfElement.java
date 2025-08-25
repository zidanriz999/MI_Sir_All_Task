package Java60PlmListMIsir;

public class IndexOfElement {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int target = 1;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + index);
    }
}

