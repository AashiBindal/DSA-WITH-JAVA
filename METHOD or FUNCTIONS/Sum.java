  //  que :take input of two no. and print the sum

// import java.util.Scanner;
// public class Sum {
    
//       public static void main(String[]args){
//         sum(); // method calling
      
//       }

//  static void sum(){
//          Scanner ab= new Scanner(System.in);
//   int num1 , num2 , sum;

//   System.out.println("Enter no. 1 : ");
//   num1 = ab.nextInt();
//   System.out.println("Enter no. 2 : ");
//   num2 = ab.nextInt();

//   sum= num1+num2;
//    System.out.println("the sum =" + sum);

//      ab.close();
//  }
//       }


// return the value

import java.util.Scanner;

public class Sum{
    
    public static void main(String []args){
        int ans = sum2();
        System.out.println(ans);

        
    }

    static int sum2(){
        Scanner ab= new Scanner(System.in);
     
  int num1 , num2 , sum;

  System.out.println("Enter no. 1 : ");
  num1 = ab.nextInt();
  System.out.println("Enter no. 2 : ");
  num2 = ab.nextInt();

  sum= num1+num2;
  ab.close();
   return sum;
  
    }
 
}


















