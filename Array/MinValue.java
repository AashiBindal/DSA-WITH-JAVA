public class MinValue {
    static void main(){
        int arr[] ={4 , -65 , 78, 100 , -213 };
        int n = arr.length;
        int minValue = arr[0];

        // compare minValue with every element of array 
        for(int i=0 ; i<=n-1 ; i++){
           if(arr[i] < minValue){
            // update value 
            minValue = arr[i] ;
           } 
        }
        System.out.println("minimum value of array is : " + minValue);
    }
}
