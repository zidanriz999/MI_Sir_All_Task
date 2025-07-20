import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int n = input.nextInt();
        int k = input.nextInt();

       
        int[] scores = new int[n];

       
        for (int i = 0; i < n; i++) 
        {
            scores[i] = input.nextInt();
        }

        
        int cutoffScore = scores[k - 1];
        int count = 0;

       
        for (int i = 0; i < n; i++) 
        {
            if (scores[i] >= cutoffScore && scores[i] > 0) 
            {
                count++;
            } 
            
            else
            
            {
               
                continue;
            }
        }

        
        System.out.println(count);

        input.close();
    }
}
