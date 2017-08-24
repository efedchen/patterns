public class MeatDetails extends Meat {

    private MeatDatabase meatDatabase;

    public MeatDetails(String meatName) {
        super(meatName);
    }

    @Override
    public void loadData(){
        meatDatabase = new MeatDatabase();

        safeCookTemperatureFahrenheit = meatDatabase.getSafeCookTemp(meatName, TemperatureType.Fahrenheit);
        safeCookTemperatureCelsius = meatDatabase.getSafeCookTemp(meatName, TemperatureType.Celsius);
        caloriesPerOunce = meatDatabase.getCaloriesPerOunce(meatName);
        proteinPerOunce = meatDatabase.getProteinPerOunce(meatName);

        super.loadData();

        System.out.println("Safe cook temperature (F) " + safeCookTemperatureFahrenheit);
        System.out.println("Safe cook temperature (C) " + safeCookTemperatureCelsius);
        System.out.println("Calories per Ounce " + caloriesPerOunce);
        System.out.println("Protein per ounce " + proteinPerOunce);
    }
}
