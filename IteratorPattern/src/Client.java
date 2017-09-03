public class Client {

    public static void main(String[] args) {
        System.out.println("Gets animals through Iterator");

        IContainer iContainer = new AnimalContainer();
        IIterator iIterator = iContainer.createIterator();
        while (iIterator.hasNext()) {
            Object object = iIterator.next();
            System.out.println(object);
        }

        System.out.println("Gets flowers through Iterator");
        IContainer iContainer1 = new FlowerContainer();
        IIterator iIterator1 = iContainer1.createIterator();
        while (iIterator1.hasNext()) {

            Object object = iIterator1.next();
            System.out.println(object);
        }
    }
}
