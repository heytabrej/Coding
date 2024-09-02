import java.util.Scanner;

public class func {
    public static void myMethod(int n) {
        if (n < 0){
            System.out.println("invalid number");
        }
        int fac = 1;
        for(int i =n;i>=1;i--){
            fac = fac *i;

        }
       
        System.out.println(fac);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        myMethod(n);
    }
}
