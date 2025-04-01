package abstractfactorydp;

public class BankB implements Bank{
    private String bankName="Bank B";
    @Override
    public String getBankName() {
        return bankName;
    }
}
