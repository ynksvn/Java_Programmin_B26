package day15_switch;

public class NumberWords {
    public static void main(String[] args) {
        int n=3;




        //as switch statement
switch (n){
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
    case 4:
        System.out.println("Four");
        break;
    case 5:
        System.out.println("Five");
        break;
    default:
        System.out.println("Invalid number");







        //as if statement

        if(n==1){
            System.out.println("one") ;
        }else if (n == 2){
            System.out.println("two") ;
        }else if (n ==3 ){
            System.out.println("three") ;
        }else if (n == 4){
            System.out.println("four") ;
        }else if (n == 5){
            System.out.println("five") ;
        }else{
            System.out.println("Invalid number") ;
        }
}
    }
}



