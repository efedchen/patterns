public class AdultsConcreteFactory extends RecipeFactory {
    @Override
    public Sandwich CreateSandwich() {
        return new Hamburger();
    }

    @Override
    public Dessert CreateDessert() {
        return new CremeBrulee();
    }
}
