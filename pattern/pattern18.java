public class pattern18 {
    static void main(){
        int n=4 ;
        for(int r=1 ; r<=n ; r++){
            //part1 print space
            for(int c=1 ; c<= n-r ; c++){
                System.out.print("  ");
            }
            //part2 
            for(int c= 1 ; c<=2*r-1 ; c++){
                System.out.print(r+  " ");
            }
            System.out.println();
        }
    }
}
