package abstractfactorydp;

public class FixedDeposit extends Deposit{
    @Override
    void getInterestRate(double r) {
        rate=r;
    }
}
