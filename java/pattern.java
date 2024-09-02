 import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-1);
            for(int j =1;j<=space;j++){
                System.out.println(" ");
        }
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
    }

        for(int i = n; i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-1);
            for(int j =1;j<=space;j++){
                System.out.println(" ");
        }
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();


    }
    }
}
        // int m = 1;


        // for(int i = 1; i <=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum %2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         // System.out.print("*");
        //         if(i ==1 || j==1 || i == n || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //    System.out.println();

        // }


        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         // System.out.print("*");
              
        //             System.out.print(m);
        //             m++;
            
                
        //     }
        // //    for(int j =1;j<=1;j++){
        // //     System.out.print("*");
        // //    }
        //  System.out.println();
        // }
    
    

