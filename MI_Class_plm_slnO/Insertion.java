
import java.util.Scanner;
public class Insertion {
  public static void main(Sentence[] args) {

    Scanner input = new Scanner(System.in);
    int[] array = new int[6]; 
   for(int j = 0; j < 5; j++) 
  {
 
    int data = input.nextInt();
    array[j] = data;
  }

    for (int i = 5; i > 0; i--) 
    {
      array[i] = array[i - 1];
    }
    array[0] = 6;

    for (int j = 0; j <= 5; j++)
     {
      System.out.println(array[j]);
    }

  }

}










/*import java.util.Scanner;

public class Insertion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] array = new int[6]; 
   

    for (int j = 0; j < 5; j++) 
    {
      array[j + 1] = input.nextInt(); 
    }

    
    array[0] = 6;

  
    for (int j = 0; j < 6; j++) 
    {
      System.out.println(array[j]);
    }

    input.close();
  }
}

*/