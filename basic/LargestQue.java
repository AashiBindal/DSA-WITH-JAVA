
import java.util.Scanner;


public class LargestQue {
    static void main(){
    Scanner ab= new Scanner(System.in);
      System.out.println("find the largest of the three no. ");
    int a = ab.nextInt();
    int b = ab.nextInt();
    int c=  ab.nextInt();

   

    //  int max=a;
    //  if(b>max){
    //     System.out.println("largest no. = " + b );
    //  } 
    //  if (c>max){
    //     System.out.println("largest no. = " + c );
    //  }
    //  else{
    //     System.out.println("largest no. = " + a );
    //  }

// int max=a;
// if(b>max){
//     max=b;
// }   
// if(c>max){
//     max=c;
// }   
// System.out.println("largest no. = " + max );



int max=Math.max(c,Math.max(a,b));
System.out.println("largest no. = " + max );


// Math.max(x, y) → dono numbers me jo bada hoga use return karta hai


ab.close();
    }
}
