public class pattern9 {
    static void main(){
        System.out.println("hollow right angle triangle");
        int n=7;
       for(int row=1 ; row<=n ; row++){
        if(row==1 || row==2 ||row==n){
            for(int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
        }
        else{
            // 1*
            System.out.print("* ");
            //(ROW-2)SPACE
            for(int col=1; col<=row-2 ; col++){
                System.out.print("  ");
            }
            //*1 
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
