public class selectionsor{

    public static void printarry( int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");



        }

       System.out.println();

    }
    public static void main(String[] args){

        int arr[] = {7,3,8,1,2};

        // selection sort

        for(int i = 0; i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i] = temp;
        }

        printarry(arr);

        
        
    }

}
