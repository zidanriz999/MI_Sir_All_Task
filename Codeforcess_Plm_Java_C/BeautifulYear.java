import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (true) {
            n++;
            String x = "" + n;
            if (x.charAt(0) != x.charAt(1) &&
                x.charAt(0) != x.charAt(2) &&
                x.charAt(0) != x.charAt(3) &&
                x.charAt(1) != x.charAt(2) &&
                x.charAt(1) != x.charAt(3) &&
                x.charAt(2) != x.charAt(3)) {
                System.out.println(n);
                break;
            }
        }
    }
}
