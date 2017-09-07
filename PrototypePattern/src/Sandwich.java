public class Sandwich extends SandwichPrototype {
    private String Bread;
    private String Meat;
    private String Cheese;
    private String Veggies;

    public Sandwich(String bread, String meat, String cheese, String veggies) {
        Bread = bread;
        Meat = meat;
        Cheese = cheese;
        Veggies = veggies;
    }

    @Override
    public Object clone(){
        String ingredientList = getIngredientList();
        System.out.println("Cloning sandwiches with ingredients: "
                + ingredientList.remove());
    }
}
