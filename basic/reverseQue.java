import java.util.Scanner;
public class reverseQue {
    static void main(){
Scanner sc = new Scanner(System.in);

System.out.println("find the reverse of a no. ");

System.out.println("enter the no. :");
int n= sc.nextInt();
int rev=0;

while(n!=0){
    int rem = n%10;
     n=n/10;
    rev=rev*10+rem;
   
}
System.out.println("the reverse of the no. is : "+rev);




















sc.close();
    }
}
