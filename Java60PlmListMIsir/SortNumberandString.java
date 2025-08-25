package Java60PlmListMIsir;

   import java.util.Arrays;
public class SortNumberandString { 
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        String[] words = {"Banana", "Apple", "Mango"};

        Arrays.sort(numbers);
        Arrays.sort(words);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted words: " + Arrays.toString(words));
    }
}

  

