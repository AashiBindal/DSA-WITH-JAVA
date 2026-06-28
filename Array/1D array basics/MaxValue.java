public class MaxValue {
    static void main(){
        int arr[] ={4 , -65 , 78, 100 , 23 };
        int n = arr.length;
        int maxValue = arr[0];

        // compare maxValue with every element of array 
        for(int i=0 ; i<=n-1 ; i++){
           if(arr[i] > maxValue){
            // update value 
            maxValue = arr[i] ;
           } 
        }
        System.out.println("maximum value of array is : " + maxValue);
    }
}
