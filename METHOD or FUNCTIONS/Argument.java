// pass the value of numbers when you are calling the method in main()
// import java.util.Scanner;


public class Argument {
    public static void main(String[]args){
      int  ans =sum(10,20);
      System.out.println(ans);
    }


static int sum(int a, int b ){
    int sum=a+b;
    return sum;
}
}