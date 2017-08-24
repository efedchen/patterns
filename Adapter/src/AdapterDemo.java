public class AdapterDemo {
    public static void main(String[] args) {
        Meat unknown = new Meat("beef");
        unknown.loadData();

        MeatDetails beef = new MeatDetails("beef");
        beef.loadData();

        MeatDetails turkey = new MeatDetails("turkey");
        turkey.loadData();

        MeatDetails chicken = new MeatDetails("chicken");
        chicken.loadData();
    }
}
