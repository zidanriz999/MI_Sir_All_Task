public class stringMethodeTest {
  public static void main(String[] args) {
        
        String s1 = "Hello World";
        System.out.println("contains(): " + s1.contains("World"));         // contains()

       
        System.out.println("substring(): " + s1.substring(6));     // substring()

       
        String joined = String.join("-","Java", "Python", "C++");      // join()
        System.out.println("join(): " + joined);

      
        System.out.println("replace(): " + "apple".replace("p", "b"));      // replace()

       
        System.out.println("replaceAll(): " + "one1two2".replaceAll("\\d", "*"));    // replaceAll()

        
        System.out.println("replaceFirst(): " + "one1two2".replaceFirst("\\d", "*"));   // replaceFirst()

      
        System.out.println("charAt(): " + s1.charAt(1));      // charAt()

      
        byte[] bytes = s1.getBytes();
        System.out.print("getBytes(): ");                          // getBytes()
        for(byte b : bytes) System.out.print(b + " ");
        System.out.println();

        
        System.out.println("indexOf(): " + s1.indexOf("World"));    // indexOf()

        
        System.out.println("compareTo(): " + "apple".compareTo("banana"));    // compareTo()

        
        System.out.println("compareToIgnoreCase(): " + "Hello".compareToIgnoreCase("hello"));   // compareToIgnoreCase()

        String s2 = "  Hello  ";
        System.out.println("trim(): [" + s2.trim() + "]");       // trim()

       
        String formatted = String.format("Name: %s, Age: %d", "Alice", 25);     // format()
        System.out.println("format(): " + formatted);

       
        String[] parts = "a,b,c".split(",");
        System.out.print("split(): ");                            // split()
        for (String part : parts) System.out.print(part + " ");
        System.out.println();

        
        System.out.println("toLowerCase(): " + "HELLO".toLowerCase());     // toLowerCase()

        System.out.println("toUpperCase(): " + "hello".toUpperCase());      // toUpperCase()

       
        int number = 123;
        System.out.println("valueOf(): " + String.valueOf(number));        // valueOf()

        
        char[] chars = "Java".toCharArray();
        System.out.print("toCharArray(): ");                   // toCharArray()
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

       
        System.out.println("matches(): " + "test@example.com".matches(".*@.*\\.com"));       // matches()

               
        String str1 = "Hello World";
        System.out.println("startsWith: " + str1.startsWith("Hello"));        // startsWith

        
        System.out.println("endsWith: " + str1.endsWith("World"));           // endsWith

       
        String str2 = "";
        System.out.println("isEmpty: " + str2.isEmpty());        // isEmpty


        String a1 = new String("Java");
        String a2 = s1.intern();                                  // intern
        System.out.println("intern: " + (a1 == a2)); 

        
        String a3 = "Java";
        StringBuffer sb = new StringBuffer("Java");              // contentEquals
        System.out.println("contentEquals: " + a3.contentEquals(sb));

      
        System.out.println("hashCode: " + a3.hashCode());             // hashCode

        
        System.out.println("subSequence: " + str1.subSequence(0, 5));       // subSequence

        
    }





  
  
}
