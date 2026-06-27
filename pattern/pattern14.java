public class pattern14 {
    static void main(){
        //part1
        int n=5;
        for(int row=1 ; row<= n ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(col + "  ");
            }
            System.out.println();
        }
        //part2
        int m=5;
        int count=1;
         for(int row=1 ; row<= m ; row++){
            for(int col=1 ; col<=row ; col++){
                  System.out.print(count + "  ");
                  count++ ;
            }
            System.out.println();
        }
        
    }
}
