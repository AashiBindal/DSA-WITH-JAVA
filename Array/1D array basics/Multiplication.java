import java.util.Scanner ;
public class Multiplication {
     static void main(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter 5 values : ");
    int arr[] = new int[5];
    int n = arr.length;
    for(int i = 0 ; i<=n-1 ; i++){
        arr[i] = sc.nextInt();
    }
    int Mul=1; 
    for(int i = 0 ; i<=n-1 ; i++){
        int value=arr[i];
        Mul= Mul*value;
    }
    System.out.println("total multiplication : " + Mul);
 sc.close();
    }
}
