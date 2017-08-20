public class Client {
    public static void main(String[] args) {

        //asks the user if they are a child or an
        //adult and then displays the corresponding menu items

        String choice = "A"; //A just because i dont want to mess around with implementation of choice input code

        System.out.println("Who are you? An adult (A) or a child (B)");

        //asks the user + checks if the answer is correct (A or B)

        System.out.println("You chose " + choice);
        RecipeFactory factory = null;

        if (choice == "A") {
            factory = new AdultsConcreteFactory();
        } else if(choice == "B"){
            factory = new ChildConcreteFactory();
        }

        Sandwich sandwich = factory.CreateSandwich();
        Dessert dessert = factory.CreateDessert();

        System.out.println("Sandwich " + sandwich.getClass());
        System.out.println("Dessert " + dessert.getClass());
    }
}
