public class SendDairyFreeOrder extends SendOrder {
    @Override
    public void sendOrder() {
        restaurant.placeOrder("Dairy free order");
    }
}
