package Java60PlmListMIsir;

public class DuplicatesString {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Apple", "Mango", "Banana"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
