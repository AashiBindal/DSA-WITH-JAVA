import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner ab = new Scanner(System.in);



System.out.println("enter fruit name:");
        String friut = ab.next();

        // if (friut.equals("mango")){
        // System.out.println("king of fruit");

        // }
        // if(friut.equals("apple")){
        // System.out.println("a sweet red fruit");
        // }

        // syntax of switch
        // switch (friut) {
        // case value:
        // body
        // break;

        // default:
        // body
        // }
        
        switch (friut) {

            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruits");
            default -> System.out.println("please enter a valid fruit");

        }

        // in this syntax break is not req other break is req
        System.out.println("enter operator:");
        String cal = ab.next();

        switch (cal) {
            case "+" -> System.out.println("AADITION OP");
            case "-" -> System.out.println("SUBTRACTION OP");
            case "*" -> System.out.println("MULTIPLICATION OP");
            case "/" -> System.out.println("DIVISION OP");
            case "%" -> System.out.println("MODULUS OP");


        }
       System.out.println("enter number:");
        int day =ab.nextInt();

        switch(day){
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               System.out.println("weekdays");
               break;
               case 6:
                case 7:
                    System.out.println("weekends");
                  break;

        }
       
        // switch(day){
        //     case 1,2,3,4,5 -> System.out.println("weekdays");
        //     case 6,7 -> System.out.println("weekends");
        // }





        ab.close();

    }

}
