public class StringMethods {
    static void main() {
        // empty-> length = 0
        // blank->empty or sirf spaces hai string mai
        System.out.println("isEmpty() and isBlank() ");
        String str = "";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        String strr = "  ";
        System.out.println(strr.length());
        System.out.println(strr.isBlank());

        System.out.println(".trim() ");

        String name = "     lOVE     ";
        System.out.println(name.length());
        name = name.trim(); // blank spaces htane k liye
        System.out.println(name.length());

        System.out.println("toUpperCase() and  .toLowerCase() ");

        String Name = "love";
        System.out.println(Name.toUpperCase());
        String NaMe = "LOVe";
        System.out.println(NaMe.toLowerCase());

        System.out.println("substring( , ) and contains");

        String Strr = "MY NAME IS AASHI BINDAL" ;
        // 0 -> m
        // 1 -> y
        // 2 -> space ... and so on
        //beginIndex -> 11(A) -> inclusive
        //endIndex -> 16(space) -> exclusive
         System.out.println(Strr.substring(11,16));
         System.out.println(Strr.contains("BINDAL")); // for check vo word usme hai ya nahi 


         System.out.println("valueOf()");

         int num= 1234 ;
         String sTr = String.valueOf(num);
         System.out.println("num+1 : " +num+1); // in int -> addition
         System.out.println("sTr+1 : " +sTr+1);  // in string concatination

        System.out.println(".startsWith and  .endsWith");

         String nAmE = "DSA with java" ;
         System.out.println(nAmE.startsWith("with"));
         System.out.println(nAmE.startsWith("DSA"));
         System.out.println(nAmE.endsWith("java"));

 System.out.println(".toCharArray() -> change string into char array ");

String array = "STRING" ;
char[] crr = array.toCharArray();
// print the char array
for(char ch:crr){
    System.out.println("vlue of char : " + ch );
}

System.out.println("split() -> convert string into array basis of some criteria" );
String input = "hi,i,am,aashi ";
String[] word = input.split(",");
for(String  strrrr : word){
    System.out.println(strrrr);
}
         
System.out.println("replace()");

String replace = "ABCADEAGHIAAAA" ;
 replace = replace.replace("A", "z");
System.out.println(replace);


    }
}