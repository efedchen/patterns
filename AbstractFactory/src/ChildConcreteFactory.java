public class ChildConcreteFactory extends RecipeFactory {

    @Override
    public Sandwich CreateSandwich() {
        return new GrilledCheese();
    }

    @Override
    public Dessert CreateDessert() {
        return new IceCream();
    }
}
