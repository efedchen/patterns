public class SendGlutenFreeOrder extends SendOrder {
    @Override
    public void sendOrder() {
        restaurant.placeOrder("Gluten free order");
    }
}
