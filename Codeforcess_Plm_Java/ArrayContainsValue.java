package Java60PlmListMIsir;

public class ArrayContainsValue {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int target = 8;
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println("Contains " + target + "? " + found);
    }
}

  

