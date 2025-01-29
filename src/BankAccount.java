import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37;

        System.out.println("---------------Bob's Checking Account--------------");
        System.out.println("    Starting Balance: $" + balance);
        System.out.println("    Withdrawal of $" + 302.50);
        balance -= 302.50;
        System.out.println("    New Balance: $" + balance);
        System.out.println("    Deposit of $"+ 50.03);
        balance += 50.03;
        System.out.println("    New Balance: $" + balance);
        System.out.println("    Withdraw half of balance");
        balance /= 2;
        System.out.println("    New Balance: $"+ balance);
        System.out.println("    Deposit of $" + 20.00);
        balance += 20.00;
        System.out.println("    New Balance: $" + balance);
        System.out.println("    Withdrawal of $" + 1.00);
        balance -= 1.00;
        System.out.println("    New Balance: $" + balance);
        System.out.println("    Deposit of Paycheck");
        balance *= 2;
        System.out.println("    Deposit of $" + 1.00);
        balance += 1;
        BigDecimal ru = new BigDecimal(balance);
        ru = ru.setScale(2, RoundingMode.HALF_UP);
        System.out.println("    New Balance: $" + ru);

    }
}