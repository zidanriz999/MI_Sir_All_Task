import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String username = input.next();

        Set<Character> uniqueLetters = new HashSet<>();

        
        for (int i = 0; i < username.length(); i++) 
        
        {
            uniqueLetters.add(username.charAt(i));
        }

       
        if (uniqueLetters.size() % 2 == 0) 
        
        {
            System.out.println("CHAT WITH HER!");
        } 
        
        else
        
        {
            System.out.println("IGNORE HIM!");
        }
    }
}
