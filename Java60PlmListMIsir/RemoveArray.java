
package Java60PlmListMIsir;

public class RemoveArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        int target = 8;
        int[] newArr = new int[numbers.length - 1];
        int index = 0;
        for (int num : numbers) {
            if (num != target) {
                newArr[index++] = num;
            }
        }
        System.out.println("After removal: " + java.util.Arrays.toString(newArr));
    }
}
