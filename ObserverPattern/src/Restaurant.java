public class Restaurant implements IRestaurant {

    private String nameOfRestaurant;
    private Vegetables vegs;
    private double purchaseThreshold;

    public Restaurant(String name, double purchaseThreshold) {
        this.nameOfRestaurant = name;
        this.purchaseThreshold = purchaseThreshold;
    }

    public void update(Vegetables vegetables) {
        System.out.println("Notified " + nameOfRestaurant
                + " of "
                + vegetables.getClass().getName()
                + "'s price change to " + vegetables.getPricePerPound() + " per pound.");
    }

}
