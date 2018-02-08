import java.util.*;

public class Retirement2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How mush easy will you contribule every year");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance;
        int year = 0;

        String input;

        do
        {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            System.out.print("After year %d, your balance is %d", year, balance);

            System.out.print("Ready to retire(Y/N)");

            input = in.next();
        }
        while (input.equals("N"));
    }
}