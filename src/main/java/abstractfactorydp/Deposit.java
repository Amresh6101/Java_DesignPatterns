package abstractfactorydp;

import java.util.Map;

public abstract class Deposit {
    protected double rate;
    abstract void getInterestRate(double rate);
    public double  calculateWithdrawalAmount(double amount, int tenure){
        return Math.floor(amount*Math.pow((1+(rate/400)),(tenure*4)));
    }
}
