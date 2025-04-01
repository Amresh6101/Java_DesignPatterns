package abstractfactorydp;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
    public abstract Deposit getDeposit(String deposit);

}
