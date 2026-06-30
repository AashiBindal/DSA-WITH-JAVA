public class comparision {
    static void main(){
        String str = "love";
         String strr = "love";
         if(str == strr){
            System.out.println("both strings refer at the same location");
         }else{
            System.out.println("both strings refer at diff position");
         }
       
         String name = "AASHI" ;
         String namee = "AASHI" ;
          if(name .equals(namee)){ // .equals() is case sensitive method
            System.out.println("both strings are equal");
         }else{
            System.out.println("both strings are not equal");
         }

         
         String val = "AASHI" ;
         String vall = "AasHI" ;
          if(val.equalsIgnoreCase(vall)){ // .equalsIgnorecase() is not  case sensitive method
            System.out.println("both strings are equal");
         }else{
            System.out.println("both strings are not equal");
         }


    }
}
