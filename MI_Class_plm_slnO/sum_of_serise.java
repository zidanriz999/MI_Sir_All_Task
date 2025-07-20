package MI_Class_plm_slnO;

public class sum_of_serise {
    
    public static void main(String[] args) {
        int a = 2;
        int r = 2;
        int n = 5;

        double sum = a * (Math.pow(r, n) - 1) / (r - 1);

        System.out.println("Sum of series: " + sum);
    }
    
  
}

