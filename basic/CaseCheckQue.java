import java.util.Scanner;

public class CaseCheckQue {
   static void main(){
   Scanner in = new Scanner(System.in);

//    String word = "AASHI";
//    System.out.println(word.charAt(3));

char ch = in.next().trim().charAt(0);
//trim() is used to remove the extra spaces from the input and charAt(0) is used to get the first character of the input string
System.out.println(ch);

if(ch>='a'&& ch<= 'z'){
    System.out.println("lower case");

}else if(ch>='A'&& ch<= 'Z'){
    System.out.println("upper case");
}
else{
    System.out.println("not an alphabet");
}

in.close();
   }

}
