public class linearminisearch {

    static int min(int arr[]){
                
                 
           int ans = arr[0];
           for(int i =1; i < arr.length; i++) {
            if(ans > arr[i]){
                ans = arr[i];

            }
            
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,4,34,7,2,5,6,8,9,3,6,8,-7};
        System.out.println(min(arr));
       

       
    }
}
