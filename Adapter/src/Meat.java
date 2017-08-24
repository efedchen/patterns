
//new meat class, that represents details about specific kind of meat

public class Meat {

    protected String meatName;
    protected float safeCookTemperatureFahrenheit;
    protected float safeCookTemperatureCelsius;
    protected double caloriesPerOunce;
    protected double proteinPerOunce;

    public Meat (String meatName){
        this.meatName = meatName;
    }

    public void loadData(){
        System.out.println("Meat: " + meatName + "__");
    }
}
