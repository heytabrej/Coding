import java.util.Scanner;

public class Strin {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);



         // Concatination
         String a = sc.nextLine();
         String b = sc.nextLine();
         String c = a + "@" + b;
         System.out.println(c);

         // 
          String Sentence = "My name is tabrej alam.";
          String name = Sentence.substring(11, Sentence.length());
          System.out.println(name);

        // print every character one by one
        for(int i =0;i<c.length();i++){
            System.out.println(c.charAt(i));
        }


          // compare

          if(a.compareTo(b)==0){
               System.out.println("String are equal");
          }else{
            System.out.println("String are not equal");
          }

         // print lenght of the string
        // System.out.println(c.length());

           // take input from user and print
        // String a = sc.nextLine();
        
        // System.out.println("Your name is " + a);
    }
    
}
