public abstract class Bread {

    abstract void mixIngredients();

    abstract void bake();

    public void slice(){
        System.out.println("Slice the " + getClass().getName() + " bread");
    }

    public void make() {
        mixIngredients();
        bake();
        slice();
    }
}

