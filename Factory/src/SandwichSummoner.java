
//The Factory Method pattern provides a manner in which we can instantiate objects, but the
//details of the creation of those instance are left to be defined by the instance classes
//themselves. This pattern is best used when you need to create lots of objects which are in
//the same family.

public class SandwichSummoner {
    public static void main(String[] args) {
        TurkeySandwich turkeySandwich = new TurkeySandwich();
        DagwoodSandwich dagwoodSandwich = new DagwoodSandwich();

        //OM NOM NOM
    }
}
