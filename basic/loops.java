import java.util.Scanner;
public class loops {
    static void main(){
 
    Scanner in = new Scanner(System.in);
  

   // for loop
   /*
    syntax of for loop 
   for(initialization; condition; increment/decrement){
        // body
    }
   */

    System.out.println("for loop");
    for(int num=1; num<=5; num+=1){
        System.out.println( (num));
    }
     

   for(int numm=0; numm<=20; numm+=2){
        System.out.println("even no.:" + (numm));
    }
   

  System.out.println("the value of n is:");
  int n = in.nextInt();
    for(int num =1 ; num<= n ; num++){
        // System.out.println(num + "");
       System.out.println("hello world" );
    }


    // while loop
    /*
    SYNTAX OF WHILE LOOP
    while(condition){
        // body
    }
    */
   System.out.println("while loop");
    int numm = 1;
    while(numm<=7){
        System.out.println(numm);
        numm+=1;
    }

    // do while loop

    /*
    SYNTAX OF DO WHILE LOOP 
    do{
        // body
    }while(condition);  
    
    */

  System.out.println("do while loop");
    int m = 1;
    do{
        System.out.println(m);
        m++;
    }while(m<=8);

     int p = 1;
     do{
        System.out.println("hello world");
   
     }while(p!=1);





 in.close();
    }
}
