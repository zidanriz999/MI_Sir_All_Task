import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] coins = new Integer[n];  
        int total = 0;

        for (int i = 0; i < n; i++) 
        {
            coins[i] = sc.nextInt();
            total += coins[i];
        }

        
        Arrays.sort(coins, Collections.reverseOrder());

        int mySum = 0, count = 0;
        for (int i = 0; i < n; i++) 
        {
            mySum += coins[i];
            count++;

            if (mySum > total - mySum) 
            {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
