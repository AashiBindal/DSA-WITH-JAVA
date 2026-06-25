
import java.util.Scanner;

public class takeinput {
 static void main() {        

    Scanner sc = new Scanner(System.in);
 

System.out.println("enter the value of firstNum:");
int firstNum =sc.nextInt();
System.out.println("enter the value of secondNum:");
int secondNum =sc.nextInt();

int sum = firstNum +secondNum;

System.out.println("the sum of two number is:"+(sum));

// BigInteger bigInt = sc.nextBigInteger();
// System.out.println("the value of bigInt is:"+bigInt);
 
System.out.println("enter the value of flag:");
boolean flag =sc.nextBoolean();
System.out.println("the value of flag is:"+flag);

System.out.println("enter the value of shortVal:");
short shortVal = sc.nextShort();
System.out.println("the value of shortVal is:"+shortVal);


System.out.println("enter the value of longVal:");
float floatval = sc.nextFloat();
System.out.println("the value of floatval is:"+floatval);
sc.close();
    
}
}