public class DemoObserver {
    public static void main(String[] args) throws InterruptedException {
        Carrots carrots = new Carrots(0.82);
        carrots.attach(new Restaurant("macDnlds", 0.22));
        carrots.attach(new Restaurant("KFC", 0.87));
        carrots.attach(new Restaurant("PizzaHit", 0.99));

        carrots.pricePerPound(0.79);
        Thread.sleep(2000);
        carrots.pricePerPound(0.43);
        Thread.sleep(2000);
        carrots.pricePerPound(0.56);
        Thread.sleep(2000);
        carrots.pricePerPound(0.68);
    }
}
