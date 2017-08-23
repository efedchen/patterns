public class FacadePatternDemo {
    public static void main(String[] args) {
        KitchenSection kSection = new KitchenSection();

        kSection.prepChicken();
        kSection.prepMeat();
        kSection.prepSoup();
    }
}
