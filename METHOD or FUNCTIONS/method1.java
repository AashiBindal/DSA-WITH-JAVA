import java.util.Scanner;
public class method1 {
      public static void main(String[]args){
        //  que :take input of two no. and print the sum
  Scanner ab= new Scanner(System.in);
     
  int num1 , num2 , sum;

  System.out.println("Enter no. 1 : ");
  num1 = ab.nextInt();
  System.out.println("Enter no. 2 : ");
  num2 = ab.nextInt();

  sum= num1+num2;
   System.out.println("the sum =" + sum);

 
                     

      ab.close();
      }
}
