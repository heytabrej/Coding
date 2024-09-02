
import java.util.*;


public class chainedEception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Positive No:  ");
        int num = input.nextInt();
        try {
            if (num < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }
           int result = 100/num;
           System.out.println("result is : " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } 
        catch(ArithmeticException e) {
        System.out.println(" Division by Zero");
    }
    
}

}