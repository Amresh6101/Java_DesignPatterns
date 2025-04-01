package abstractfactorydp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPattern {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AbstractFactory bankAbstractFactory=FactoryCreator.getFactory("bank");
        System.out.print("Where would you like to deposit your money: ");
        Bank bank= bankAbstractFactory.getBank(br.readLine());

        System.out.print("Enter the amount: ");
        double amount = Double.parseDouble(br.readLine());

        System.out.print("Enter the tenure in years: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("Enter the interest rate for" + bank.getBankName() + ": ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Which type of deposit?: ");
        AbstractFactory depositAbstractFactory=FactoryCreator.getFactory("deposit");
       // assert depositAbstractFactory != null;
        Deposit deposit=depositAbstractFactory.getDeposit(br.readLine());
        deposit.getInterestRate(rate);
        System.out.println("Your withdrawal amount will be: " + deposit.calculateWithdrawalAmount(amount, years));


    }
}
