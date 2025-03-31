package factorydp;

public class GetFuelFactory {
    public Fuel getFuel(String fuelType){
        if(fuelType.equalsIgnoreCase("petrol")) return new Petrol();
        else if(fuelType.equalsIgnoreCase("diesel")) return new Diesel();
        else if(fuelType.equalsIgnoreCase("cng")) return new CNG();

        else return null;
    }
}
