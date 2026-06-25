public class pattern5 {
    static void main(){
        System.out.println("inverted right angle triangle");

        int n=5;
        for(int row=1; row<=n ; row++){
            for(int col=1 ; col<=n-row +1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
