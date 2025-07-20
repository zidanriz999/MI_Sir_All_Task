package MI_Class_plm_slnO;

public class Fectorial {
    public static void main(String[] args) {
        int i;
        int fectorial = 1;
        for (i = 1; i <= 4; i++) 
        {
            fectorial = fectorial * i;
        }
        System.out.println("4! = " + fectorial);

        int num1 = 8;
        int num2 = 12;
        int gcd = 1;
        for (i = 1; i <= num1 && i <= 12; i++) 
        {
            if (num1 % i == 0 && 12 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (num1 * 12) / gcd;
        System.out.println("GCD of 8 and 12 is: " + gcd);

        System.out.println("LCM of 8 and 12 is: " + lcm);
    }

}