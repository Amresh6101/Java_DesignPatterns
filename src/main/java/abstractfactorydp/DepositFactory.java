package abstractfactorydp;

public class DepositFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Deposit getDeposit(String deposit) {
        if (deposit.equalsIgnoreCase("savings account"))        return new SavingsAccount();
        else if (deposit.equalsIgnoreCase("fixed deposit"))     return new FixedDeposit();
        else if (deposit.equalsIgnoreCase("recurring deposit")) return new ReccuringDeposit();
        return null;
    }
}
