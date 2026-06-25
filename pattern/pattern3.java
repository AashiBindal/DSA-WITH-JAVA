public class pattern3 {
    static void main(){
        System.out.println("solid triangle pattern");
        int n=5;
        for(int row=1; row<=n ; row++){
            for(int col=1 ; col<=row ; col++){
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}
