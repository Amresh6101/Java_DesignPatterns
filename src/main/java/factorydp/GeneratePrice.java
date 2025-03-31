package factorydp;

import java.util.Scanner;

public class GeneratePrice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        GetFuelFactory getFuelFactory=new GetFuelFactory();

        System.out.print("Enter type of fuel:");
        Fuel fuel= getFuelFactory.getFuel(scanner.next());
        fuel.getRate();

        System.out.print("Enter the amount in Litre: ");
        double amount=Double.parseDouble(scanner.next());

        System.out.println("The cost of Fuel:"+ fuel.calcPrice(amount));
    }
}
