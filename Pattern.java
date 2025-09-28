import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
//        for(int i=4;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//
//            }
//            System.out.print("\n");
//        }

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Even number:");
        int n=sc.nextInt();

        int sum=0;

        for(int i=0;i<=n;i++){
            sum=sum+(2*i);

        }
        System.out.println("Sum of Even Numbers:");
        System.out.println(sum);

    }
}
