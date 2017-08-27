public class DinnerOrders implements IOrderingSystem{
    @Override
    public void placeOrder(String str) {
        System.out.println("Placing order for " + str + " for the dinner");
    }
}
