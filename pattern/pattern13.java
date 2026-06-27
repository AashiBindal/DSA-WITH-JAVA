public class pattern13 {
    static void main(){
        int n=4;
       

        for(int r=1 ; r<=n ; r++){
            //part 1
            for(int c=1 ; c<=r ; c++){
                System.out.print("* ");
            }
            //part 2  for(int c=1 ; c<=r ; c++){
               for(int c=1 ; c<=2*(n-r) ; c++){
                System.out.print("  ");
            }
            //part 3 
              for(int c=1 ; c<=r ; c++){
                System.out.print("* ");
        }
    
    System.out.println();
}
    //iverted symmetrical half
  
        for(int r=1 ; r<=n ; r++){
  //part 4
             for(int c=1 ; c<=n-r+1 ; c++){
                System.out.print("* ");
        }

        // part 5 print space 
        for(int c=1 ; c<=(r-1)*2 ; c++){
                System.out.print("  ");
        }
         for(int c=1 ; c<=n-r+1 ; c++){
                System.out.print("* ");
        }

   System.out.println();
        }
       
    }
}
    



