public class data_Types {
    
static void main(){
    // primitive data types
       
byte num1 = 127;  // range -128 to 127
System.out.println(num1);

long newnum = num1 ; // implicit type casting (widening conversion)
System.out.println("newnum: " + newnum);
System.out.println("num1: " + num1);

short num2 = -32767; // range -32768 to 32767
System.out.println(num2);

int num3 = 100000; // range -2147483648 to 2147483647
System.out.println(num3);   

long num4 = 10000000000L; // range -9223372036854775808 to 9223372036854775807
System.out.println(num4);

float num5 = 10.5f; // range 1.4E-45 to 3.4028235E38
System.out.println(num5);

double num6 = 10.577777777778; // range 4.9E-324 to 1.7976931348623157E308
System.out.println(num6);

char num7 = 'a'; // range 0 to 65535
System.out.println("character: " + num7);

boolean eligibleToVote = true; // range true or false
System.out.println("eligible to vote: " + eligibleToVote);   

char num8 = 'b'; 
System.out.println("character: " + (num8 + 2) );

char num9 = 'h'; 
System.out.println("h+5= " + (char)(num9 + 5) );

long value1 = 123456789; //explicit type casting (narrowing conversion)
int value2 = (int)value1 ; 
System.out.println(value2);














}
}







