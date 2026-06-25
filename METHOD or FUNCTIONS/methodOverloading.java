public class methodOverloading {
     
    static int add(int x, int y){
        int sum = x+y;
        return sum;
    }
    static int add(int x, int y ,int z){
       int ans = x + y + z ;
       return ans;
    }

    static void main(){
        int ans1 = add(3 , 4);
        int ans2 = add(5 , 5, 5);
        System.out.println("ans1 : " + ans1);
        System.out.println("ans2 : " +ans2);
    }
}
