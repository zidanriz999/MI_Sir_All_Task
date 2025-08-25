package Java60PlmListMIsir;

public class ReverseArray {
     public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // একদম উল্টে ফেলা
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reversed: " + java.util.Arrays.toString(arr));
    }
}

