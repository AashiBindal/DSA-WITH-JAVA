public class pattern11 {
       static void main(){
        System.out.println("solid diamond pattern");

        int n=4;
        for(int row=1 ;row<=n ; row++){
            for(int col= 1 ; col<=n-row ; col++){
                 System.out.print("  ");
            }
            for(int col= 1 ; col<= 2*row -1 ; col++){
                 System.out.print("* ");
        }
        System.out.println();
    }
    
    int m=4;
for(int row=1;row<=m;row++){
    if(row==1){
        continue;
    }
    for(int col=1;col<=row-1;col++){
        System.out.print("  ");
    }
    for(int col=1;col<=2*m-2*row+1;col++){
        System.out.print("* ");
    }
    System.out.println();
}
}
}
