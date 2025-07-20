import java.util.Scanner;

public class Gravitiflip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cube = new int[n];

      
        for (int i = 0; i < n; i++) 
        {
            cube[i] = sc.nextInt();
        }

       
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (cube[i] > cube[j]) 
                {
                    int temp = cube[i];
                    cube[i] = cube[j];
                    cube[j] = temp;
                }
            }
        }

   
        for (int i = 0; i < n; i++) 
        {
            System.out.print(cube[i] + " ");
        }

        sc.close();
    }
}

       