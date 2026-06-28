import java.util.Scanner;
public class TakingInput {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
       
        int n= arr.length ;
        for(int i=0 ; i<=n-1 ; i++){
             System.out.println("enter values for index  : " + i);
             arr[i] = sc.nextInt();
        }
System.out.println("print all values");
        for(int val : arr){
            System.out.println(val);
        }
        sc.close();
    }
}
