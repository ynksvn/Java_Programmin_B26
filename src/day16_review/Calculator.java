package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
         /*
    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double num1 = input.nextDouble();
        System.out.println("Pick operators: + - * / % ");
        String operator = input.next();
        System.out.println("Enter number two ");
        double num2 = input.nextDouble();

        double result = 0;
        boolean validOperator = true;

        switch (operator) {

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
            case "x":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide to 0");
                    validOperator = false;
                }
                break;

            case "%":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Cannot remainder to 0");
                    validOperator = false;
                }
                break;
            default:
                System.out.println(operator + " is not Invalid number");
                validOperator = false;
        }
        if (validOperator) {
            System.out.println(num1 + " " + operator + " " + num2 + " " + " = " + result);
        }
    }
}


