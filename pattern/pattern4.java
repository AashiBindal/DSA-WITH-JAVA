public class pattern4 {
    static void main(){
        System.out.println("solid rombus pattern");

        int n=5;
        for(int row=1; row<=n ; row++){
            for(int col=1  ; col<=n-row ; col++){
                System.out.print("  ");
            }
            for(int col=1; col<=n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }    }
}
