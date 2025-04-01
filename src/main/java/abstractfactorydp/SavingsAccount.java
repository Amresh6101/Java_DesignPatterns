package abstractfactorydp;

public class SavingsAccount extends Deposit {
    @Override
    void getInterestRate(double r) {
        rate=r;
    }
}
