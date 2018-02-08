import java.util.*;

public class Retirement
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interst rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;  

        while (balance < goal)
            {
                balance += payment;
                double Interst = balance * interestRate / 100;
                balance += Interst;
                years++;
            }
            System.out.print("You can!");
    }
}