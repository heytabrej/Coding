import java.util.Scanner;

public class newcode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int age = sc.nextInt();
        System.out.println("My name is "+ name);
        System.out.println("i am "+ age + " years old.");

        int a = 10;
        int b = 20;
        System.out.println(2*(a+b));
        System.out.println("hello world");

        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = c + d;
        System.out.println("The value of c and d is " + e);
    }
}
