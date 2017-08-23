
//actual Facade, that hides implementation of all other methods

public class KitchenSection {
    private Food chicken;
    private Food meat;
    private Food soup;

    public KitchenSection(){
        chicken = new Chicken();
        meat = new Meat();
        soup = new Soup();
    }

    public void prepChicken(){
        chicken.prepDish();
    }

    public void prepMeat(){
        meat.prepDish();
    }

    public void prepSoup(){
        soup.prepDish();
    }
}
