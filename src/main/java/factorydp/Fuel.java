package factorydp;

public abstract class Fuel {
    protected double rate;
    abstract void getRate();
    public double calcPrice(double amount){
        return rate*amount;
    }
}
