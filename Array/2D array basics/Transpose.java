public class Transpose {
    static void main(){
          int[][]arr = {
            {1 , 2 , 3 } ,
            {4 , 5 , 6 }
          };

          for(int j= 0 ; j<=arr[0].length -1 ; j++){
            for(int i = 0 ; i<= arr.length - 1 ; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
          }



    }

    
}
