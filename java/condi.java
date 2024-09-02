import java.util.Scanner;

public class condi {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b ){
            System.out.println(" a is equal to b");

        }
        else if (a >b){
            System.out.println(" a greate than b");
        }
        else if(b > a ){
            System.out.println("b is greater than a ");
        }
        else{
            System.out.println("a is not equal to b");
        }


    }}
