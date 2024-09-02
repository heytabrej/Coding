import java.util.Arrays;

public class twodimarrlinear {

    static int[] twodimension(int arr[][], int target){

        for( int i = 0; i<arr.length; i++ ){
            for(int j =0; j<arr[i].length; j++)
            {
                if( arr[i][j] == target){
                    return new int[]{i,j};

                }

          


            }

       
      
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[][] num = { {1,2,3},{4,5,6},{7,8,9} }; 
        int target = 5;
        int ans[] = twodimension(num, target);
        System.out.println(Arrays.toString(ans));


        }
        

    }

