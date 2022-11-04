package day11_if_statement;

public class BankAccount {
    public static void main(String[] args) {

        double balance = 100;
        double withdraw = 50;

        balance -= withdraw; // balance = balance - withdraw4


        if (balance< 0){
            System.out.println("Took out too much money, $100 overdraft applied");
            balance -= 100;

        }
        System.out.println(balance);
        System.out.println("Thank you");
    }
}
