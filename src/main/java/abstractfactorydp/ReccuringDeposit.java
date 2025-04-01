package abstractfactorydp;

public class ReccuringDeposit extends Deposit {
    @Override
    void getInterestRate(double r) {
        rate=r;
    }
}
