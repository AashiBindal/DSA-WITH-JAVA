public class pattern17 {
    static void main(){
        int n = 4 ;
       
       for(int row=1 ; row<=n ; row++){
         // part 1
        for(int col=1 ; col<=n-row ; col++){
            System.out.print("  ");
        }
        //part2
        for(int col=1 ; col<=row ;col++){
            System.out.print(col + " ");
        }
        //part3
     
        int decRowValue = row -1 ;
        for(int col=1 ; col<=row-1 ; col++){
            System.out.print(decRowValue+" ");
           decRowValue-- ;
        }

         System.out.println();
       }
    
    }
}
