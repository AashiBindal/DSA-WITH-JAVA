import java.util.Scanner ;
public class TotalSum {
    static void main(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter 5 values : ");
    int arr[] = new int[5];
    int n = arr.length;
    for(int i = 0 ; i<=n-1 ; i++){
        arr[i] = sc.nextInt();
    }
    int sum=0; 
    for(int i = 0 ; i<=n-1 ; i++){
        int value=arr[i];
        sum= sum+value;
    }
    System.out.println("total sum : " + sum);
 sc.close();
    }
}
