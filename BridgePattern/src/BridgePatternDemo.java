public class BridgePatternDemo {
    public static void main(String[] args) {
        SendOrder order = new SendDairyFreeOrder();
        order.restaurant = new DinnerOrders();
        order.sendOrder();

        System.out.println("_-_-_-_");

        order.restaurant = new FancyRestaurantOrders();
        order.sendOrder();

        System.out.println("_-_-_-_");

        order = new SendGlutenFreeOrder();
        order.restaurant = new DinnerOrders();
        order.sendOrder();

        System.out.println("_-_-_-_");

        order.restaurant = new FancyRestaurantOrders();
        order.sendOrder();
    }
}
