public class recur1 {
     // loop iteration
    // public static void numbprint(int n){
    //     for(int i = n; i>0; i--){
    //         System.out.println(i);
    //     }
    // }

    public static void numbprint(int n){
        // print 1 to 5
        
        if(n > 5){
            return;
                }

        // print 5 to 1
        // if(n==0){
        //     return;
        //         }
    //    System.out.println(n); 
    //    numbprint(n-1);
    System.out.println(n); 
       numbprint(n+1);
    }
    public static void main(String[] args) {
        // int n = 5;
        // numbprint(n);

        int n = 1;
        numbprint(1);
    }
    
}
