import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Vegetables extends Observable {
    private double pricePerPound;
    private List<IRestaurant> restaurants = new ArrayList<>();

    public Vegetables(double pricePerPound){
        this.pricePerPound = pricePerPound;
    }

    public void attach(IRestaurant restaurant){
        restaurants.add(restaurant);
    }

    public void detach(IRestaurant restaurant){
        restaurants.remove(restaurant);
    }

    public void notifyRest(){
        for (IRestaurant restaurant : restaurants) {
            restaurant.update(this);
        }
    }
    public void pricePerPound(double purchaseThreshold){
        if(pricePerPound!=purchaseThreshold){
            pricePerPound=purchaseThreshold;
            notifyRest();
        }
    }

    public double getPricePerPound() {
        return pricePerPound;
    }
}
