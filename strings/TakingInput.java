import java.util.Scanner ;
public class TakingInput {
    static void main(){
        Scanner sc = new Scanner (System.in);
        System.out.println("what is your name ?");
        String name = sc.nextLine() ;
        System.out.println( "name  : " + name);


        System.out.println("how old are u ? ");
        String age = sc.next();
        System.out.println("your age : " + age );
         sc.close();
    }
   
}


/*
what is your name ?
my name is aashi bindal
name  : my name is aashi bindal
how old are u ? 
20 years old
your age : 20
*/