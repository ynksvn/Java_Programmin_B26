package day07_unary_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax;
        salary = 100000;
        stateTaxRate = 0.08;// %8
        federalTaxRate = 0.21;  //%21
        // double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

      String taxReport = "State tax rate: " + stateTaxRate + ", Federal tax rate: " + federalTaxRate + ", base salary : $" + salary + "\nTax amounts: " + stateTax + " for state tax and " + federalTax + " for federal tax rate. The total amount of tax is " + totalTax + "\nAfter tax your salary is " + salaryAfterTax;

        System.out.println(taxReport);






    }
}


/* create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes */