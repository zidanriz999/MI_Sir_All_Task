public class StringMethods {
    public static void main(String[] args) {
       
            // contains() একটি সাবস্ট্রিং কোনো স্ট্রিংয়ের মধ্যে আছে কি না চেক করে।
        String s1 = "Hello World";
        System.out.println("contains(): " + s1.contains("World"));         
       

        // substring() কাজ: স্ট্রিং থেকে একটি অংশ কেটে নেয়।
        System.out.println("substring(): " + s1.substring(6));    

       
        String joined = String.join("-", "Java", "Python", "C++");      // join()
        System.out.println("join(): " + joined);


       // replace() কাজ: একটি ডেলিমিটার ব্যবহার করে একাধিক স্ট্রিং জোড়া লাগায়।
        System.out.println("replace(): " + "apple".replace("p", "b"));     

       // replaceAll() কাজ: একটি স্ট্রিংয়ের সব মিল পাওয়া অংশ প্রতিস্থাপন করে।
        System.out.println("replaceAll(): " + "one1two2".replaceAll("\\d", "*"));    

        // replaceFirst() কাজ: একটি স্ট্রিংয়ের প্রথম মিল পাওয়া অংশ প্রতিস্থাপন করে।
        System.out.println("replaceFirst(): " + "one1two2".replaceFirst("\\d", "*"));   

      
         // charAt() কাজ: একটি স্ট্রিংয়ের নির্দিষ্ট সূচকের অক্ষর প্রদান করে।
        System.out.println("charAt(): " + s1.charAt(1));     

      
         // getBytes() কাজ: একটি স্ট্রিংকে বাইট অ্যারে রূপে রূপান্তর করে।
        byte[] bytes = s1.getBytes();
        System.out.print("getBytes(): ");                         
        for(byte b : bytes) System.out.print(b + " ");
        System.out.println();

        
        // indexOf() কাজ: একটি স্ট্রিংয়ের মধ্যে একটি সাবস্ট্রিংয়ের প্রথম উপস্থিতির সূচক প্রদান করে।
        System.out.println("indexOf(): " + s1.indexOf("World"));    

        
            // compareTo() কাজ: দুটি স্ট্রিংয়ের মধ্যে লেক্সিকোগ্রাফিক্যাল তুলনা করে।
        System.out.println("compareTo(): " + "apple".compareTo("banana"));

        
        // compareToIgnoreCase() কাজ: দুটি স্ট্রিংয়ের মধ্যে লেক্সিকোগ্রাফিক্যাল তুলনা করে, কেস সংবেদনশীলতা উপেক্ষা করে।
        System.out.println("compareToIgnoreCase(): " + "Hello".compareToIgnoreCase("hello"));   

         // trim() কাজ: একটি স্ট্রিংয়ের শুরু এবং শেষের ফাঁকা স্থানগুলো মুছে ফেলে।
        String s2 = "  Hello  ";
        System.out.println("trim(): [" + s2.trim() + "]");      

       
        // format() কাজ: একটি স্ট্রিংকে নির্দিষ্ট ফরম্যাটে রূপান্তর করে।
        String formatted = String.format("Name: %s, Age: %d", "Alice", 25);     
        System.out.println("format(): " + formatted);

       
        // split() কাজ: একটি স্ট্রিংকে নির্দিষ্ট ডেলিমিটার দিয়ে বিভক্ত করে।
        String[] parts = "a,b,c".split(",");
        System.out.print("split(): ");                            
        for (String part : parts) System.out.print(part + " ");
        System.out.println();

        
        // toLowerCase() কাজ: একটি স্ট্রিংকে ছোট হাতের অক্ষরে রূপান্তর করে।
        System.out.println("toLowerCase(): " + "HELLO".toLowerCase());     

        // toUpperCase() কাজ: একটি স্ট্রিংকে বড় হাতের অক্ষরে রূপান্তর করে।
        System.out.println("toUpperCase(): " + "hello".toUpperCase());      
       

        // valueOf() কাজ: একটি অবজেক্টকে স্ট্রিংয়ে রূপান্তর করে।

        int number = 123;
        System.out.println("valueOf(): " + String.valueOf(number));        
        
          // toCharArray() কাজ: একটি স্ট্রিংকে ক্যারেক্টার অ্যারে রূপে রূপান্তর করে।
        char[] chars = "Java".toCharArray();
        System.out.print("toCharArray(): ");                 
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

       
        // matches() কাজ: একটি স্ট্রিংকে একটি রেগুলার এক্সপ্রেশন দিয়ে মিলিয়ে দেখে।
        System.out.println("matches(): " + "test@example.com".matches(".*@.*\\.com"));       


        // startsWith কাজ: একটি স্ট্রিং একটি নির্দিষ্ট সাবস্ট্রিং দিয়ে শুরু হয় কি না চেক করে।        
        String str1 = "Hello World";
        System.out.println("startsWith: " + str1.startsWith("Hello"));        

        
         // endsWith কাজ: একটি স্ট্রিং একটি নির্দিষ্ট সাবস্ট্রিং দিয়ে শেষ হয় কি না চেক করে।
        System.out.println("endsWith: " + str1.endsWith("World"));          

       
         // isEmpty কাজ: একটি স্ট্রিং খালি কি না চেক করে।
        String str2 = "";
        System.out.println("isEmpty: " + str2.isEmpty());       

        // intern() কাজ: একটি স্ট্রিংয়ের ইন্টার্নাল রিপ্রেজেন্টেশন প্রদান করে।
        String a1 = new String("Java");
        String a2 = s1.intern();                                  
        System.out.println("intern: " + (a1 == a2)); 

        // contentEquals কাজ: একটি স্ট্রিংয়ের কন্টেন্ট অন্য একটি স্ট্রিং বা StringBuffer এর সাথে মেলে কি না চেক করে।
        String a3 = "Java";
        StringBuffer sb = new StringBuffer("Java");              
        System.out.println("contentEquals: " + a3.contentEquals(sb));

      
        // hashCode কাজ: একটি স্ট্রিংয়ের হ্যাশ কোড প্রদান করে।
        System.out.println("hashCode: " + a3.hashCode());             

        // subSequence কাজ: একটি স্ট্রিংয়ের নির্দিষ্ট অংশের সাবসিকোয়েন্স প্রদান করে।
        System.out.println("subSequence: " + str1.subSequence(0, 5));       

        
    }
}


          