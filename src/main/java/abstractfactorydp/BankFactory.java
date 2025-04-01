package abstractfactorydp;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        if (bankName.equalsIgnoreCase("bank a"))        return new BankA();
        else if (bankName.equalsIgnoreCase("bank b"))   return new BankB();
        else if (bankName.equalsIgnoreCase("bank c"))   return new BankC();

        return null;
    }

    @Override
    public Deposit getDeposit(String deposit) {
        return null;
    }
}
