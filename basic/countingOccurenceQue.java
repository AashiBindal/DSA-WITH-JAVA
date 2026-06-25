import java.util.Scanner;
public class countingOccurenceQue {
    static void main(){
Scanner ab= new Scanner(System.in);
System.out.println("find the occurence of a number in an array");
System.out.println("eneter the value of n");
int n = ab.nextInt();
System.out.println("enter the digit to find the occurence of: ");
int digit = ab.nextInt();

int count = 0;
while(n>0){
    int rem=n%10;
     if(rem==digit){
        count++;
     }
     n=n/10; 
    
}

System.out.println("the occurence of "+digit+" is: "+count);












ab.close();
    }
}
