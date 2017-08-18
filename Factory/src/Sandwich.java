import java.util.ArrayList;
import java.util.List;

abstract class Sandwich {

    private List<Ingredient> ingredientList = new ArrayList<>();

    public Sandwich(){
        CreateIngredients();
    }

    //   ___FACTORY METHOD___
    public abstract void CreateIngredients();

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }
}
