public class conditions {
    
static void main(){

//if-else

    int salary = 25400;
    if(salary>10000){
        salary = salary + 2000;
    } else{
        salary = salary- 1000;
    }
    System.out.println("the salary is:"+salary);


    // multiple if-else 

    int salary2 = 25400;
    if(salary2>10000){
        salary2+=2000; 
    } else if (salary2>20000){
        salary2+=3000;
    }else{
        salary2-=10000;
    }

    System.out.println("the salary2 is:"+salary2);

    























}
}
