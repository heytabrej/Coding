public class linearsear {

    static int linearsearching(int arr[], int target){
        // search in the array : return index if not found
         if (arr.length == 0 ) {
            return -1;
         }


         // loop for linear searching in array
         for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                // return the index of the array 
                return index;

                
            } 
         }
         // if any of the above will not excute then this line will return 

         return -1;
    }
    public static void main(String[] args) {

        int[] num = { 2,3,4,5,5,55,5,76,67,6,466,776,456,7,5,46,4674,64,67};
        int target = 64;
        int ans = linearsearching(num, target);
        System.out.println(ans);
    
}


}
