public class WholeWheat extends Bread{

    @Override
    void mixIngredients() {
        System.out.println("Gathering the ingredients for Whole Wheat bread!");
    }

    @Override
    void bake() {
        System.out.println("Baking the Whole Wheat bread! (15 minutes)");
    }
}
