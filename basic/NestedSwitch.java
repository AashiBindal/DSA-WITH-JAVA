import java.util.Scanner;
public class NestedSwitch {
    static void main(){
  Scanner in = new Scanner(System.in);
   System.out.println("enter empId :");
  int empId = in.nextInt();
   System.out.println("enter department :");
   String department = in.next();

    switch(empId){
     case 1:
        System.out.println("aashi");
        break;
     case 2:
        System.out.println("kunal");
        break;
      case 3 :
        System.out.println("emp no. 3");
         
        switch(department){
           case "IT":
               System.out.println("it department");
               break;
               case "MANAGMENT":
                 System.out.println("MANAGMENT department");
              break;
              default:
                System.out.println("no dept. entered");
 
        }
        break;
default:
    System.out.println("enter correct empid");
    }



in.close();
    }
}
