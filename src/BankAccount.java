public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37;

        System.out.println("---------------Bob's Checking Account--------------");
        System.out.println("    Starting Balance: " + balance);
        System.out.println("    Withdrawal of $" + 302.50);
        balance -= 302.50;
        System.out.println("    New Balance: " + balance);
        System.out.println("    Deposit of $"+ 50.03);
        balance += 50.03;
        System.out.println("    New Balance: " + balance);
        System.out.println("    Withdraw half of balance");
        balance /= 2;
        System.out.println("    New Balance: "+ balance);
        System.out.println("    Deposit of $" + 20.00);
    }
}