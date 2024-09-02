import java.util.Scanner;


public class Stringbuil {
    public static void main(String[] Args){
        StringBuilder sb = new StringBuilder("Tabrej");
        System.out.println(sb);
        // print the character of your desire using index no
        System.out.println(sb.charAt(4));


        // change the character in the string
        sb.setCharAt(0, 'L'); // sets the character at index 0 to 'L'
          System.out.println(sb); // prints the StringBuilder object to the console

          // Insert the character in between sentence
          sb.insert(0,'y');
          System.out.println(sb);

          // delete the extra "n"

          sb.delete(0,2);
          System.out.println(sb);

          // apend at last

          sb.append(" Alam");
          System.out.println(sb);

          // reverse the string
          for(int i=0;i<sb.length();i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, backchar);
          }
          System.out.println(sb);

    }

    
}
