/*
package com.javalab;

public class First {
    public static void main(String[] args){
        System.out.print("ZIDAN LAB CODE");

    }

}
*/
/*
package com.javalab;
public class First{
    public static void main(String[] arge){
        System.out.print("The sum of the number is : ");
        int num1=8,num2=10,num3=20;
        int sum=num2+num3;
        System.out.println(sum);

    }
}

 */


import java.util.Scanner;

public class Basic{
  public static void main(Sentence[] args) {
    Scanner sc = new Scanner(System.in);

          System.out.println("Enter the Number1:");
           int a = sc.nextInt();
    
           System.out.println("Enter the Number2:");
           int b = sc.nextInt();
    
           int sum= a+b;
           System.out.print("The sum of Numbers : ");
          System.out.println(sum);

          
       System.out.print("Writte a sentence: ");

       String str = sc.nextLine();
       System.out.println(str);

    sc.close();
  }
    


}


