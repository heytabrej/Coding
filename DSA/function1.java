import java.util.*;

 

public class function1 {

     static void greeting(){
        System.out.println("Hello world");
     }
    //  static void  addition(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the number one");
    //     int a = sc.nextInt();
    //      System.out.println("Enter the number two");
    //      int b = sc.nextInt();
    //       int c = a + b;
    //       System.out.println("addition of two number is : " + c);
          

    //  }
    //   static int  addition1(int e,int f){ // this is integer the function call
       
    //       int g = e + f;
    //       return g;
          
          

    //  }

    static String value(){ // String function call
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  addition();
    // int ans = addition1(56,78);
    // System.out.println(ans);
    greeting();

    String names = value();
    System.out.println(names);
    
  }
}
