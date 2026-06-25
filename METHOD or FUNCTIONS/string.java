import java.util.Scanner;
public class string {
    public static void main(String[]args){
       
        Scanner ab= new Scanner(System.in);
        System.out.println("enter your name :");
        String name =  ab.next();
        String peronalised = myGreet(name);
        System.out.println(peronalised);
        ab.close();
    }
     

    static String myGreet(String name){
        String message = "hello" + " "+ name;
        return message;
    }

}
