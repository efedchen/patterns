public class FancyRestaurantOrders implements IOrderingSystem {
    @Override
    public void placeOrder(String str) {
        System.out.println("Placing order for " + str + " at the Fancy restaurant");
    }
}
