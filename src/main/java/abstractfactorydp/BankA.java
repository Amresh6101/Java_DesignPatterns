package abstractfactorydp;

public class BankA implements Bank{
    private String bankName="Bank A";
    @Override
    public String getBankName() {
        return bankName;
    }
}
