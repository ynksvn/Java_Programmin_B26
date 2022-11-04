package day12_if_statements;

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double netPay;

        if(numberOfHours > 40){
            double overTime = numberOfHours -40;
            netPay = 40* hourlyRate;
            netPay += overTime * hourlyRate * 1.5;
        }else{
            netPay = numberOfHours * hourlyRate;
        }
        System.out.println("Total net pay is " + netPay);





        }
    }

