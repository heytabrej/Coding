import java.util.*;

public class arr {
    public static void main(String[] args){
        // int[] marks = new int[5];
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();

        int number[] = new int[size];
        for(int i =0; i<size;i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        
        for(int i = 0;i<number.length;i++){
            if(number[i]==x){
                System.out.println("number found at index" + i);
            }
        }
    }
}
