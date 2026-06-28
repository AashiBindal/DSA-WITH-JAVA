public class traversal {
    static void main(){
        int arr[][] = {
            {1 , 2 ,5 , 1 , 1, 3} , {4 , 6 , 7 } , { 0 , 4 , 5 , 5 , 6 }
        };
        for(int rowIndex = 0 ; rowIndex <= arr.length -1 ; rowIndex++){
            for(int colIndex = 0 ; colIndex<= arr[rowIndex].length-1  ;colIndex++ ){
                System.out.print(arr[rowIndex][colIndex]+ " ");
            }
            System.out.println();
        }
        

    }
}
