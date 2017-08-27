public class Sourdough extends Bread {

    //sourdough - also the name of a bread

    @Override
    void mixIngredients() {
        System.out.println("Gathering the ingredients for sourdough bread!");
    }

    @Override
    void bake() {
        System.out.println("Baking the sourdough bread! (20 minutes)");
    }
}
