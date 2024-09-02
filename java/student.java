
import java.util.Scanner;
class student{
    public static void main(String Args[]){
        System.out.println("Enter the Three Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a> c){
            System.out.println(a + "is greater then" +  b + "And" +  c);
        }
        else if (b > c && b > a){
         System.out.println( b + "is greater then" +  a + "And" +  c );
        }
        else {
            System.out.println(c + " is greater then" + a  +  "and" + b );
        }

        
    }
}