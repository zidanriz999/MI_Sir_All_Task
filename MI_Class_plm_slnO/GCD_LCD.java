package MI_Class_plm_slnO;

public class GCD_LCD {
    public static void main(String[] args) {
        int i;
        int fectorial = 1;
        for (i = 1; i <= 4; i++) {
            fectorial = fectorial * i;
        }
        System.out.println("4! = " + fectorial);

        int num1 = 8;
        int num2 = 12;
        int gcd = 1;
        for (i = 1; i <= num1 && i <= 12; i++) {
            if (num1 % i == 0 && 12 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (num1 * 12) / gcd;
        System.out.println("GCD of 8 and 12 is: " + gcd);

        System.out.println("LCM of 8 and 12 is: " + lcm);
    }

}

/*➡️ এখানে ৮ ও ১২ এর GCD (যেটি দুইটি সংখ্যাকে ভাগ দিতে পারে এমন সবচেয়ে বড় সংখ্যা) নির্ণয় করা হয়েছে।

Loop 1 থেকে শুরু করে যতক্ষণ পর্যন্ত i ৮ এবং ১২ উভয়েরই ভাজক না হয়, ততক্ষণ gcd আপডেট হতে থাকে।

সর্বশেষ gcd = 4 হয় কারণ ৪ হচ্ছে ৮ এবং ১২ উভয়ের মধ্যে সবচেয়ে বড় সাধারণ ভাজক।


*/