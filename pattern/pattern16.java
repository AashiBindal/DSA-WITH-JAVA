public class pattern16 {
    static void main(){
    int n=5 ;

    for(int row=1 ; row<=n ; row++){
        for(int col=1 ; col<= row ; col++){
            int a= n - col  ;
             int b = 'A';
             int ans = a+b ;
             char finalAns = (char)ans ;
             System.out.print(finalAns + "  ");


        }
        System.out.println();
    }
}
}
