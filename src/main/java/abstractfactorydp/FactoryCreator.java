package abstractfactorydp;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("bank"))            return new BankFactory();
        else if (choice.equalsIgnoreCase("deposit"))    return new DepositFactory();
        return null;
    }
}
