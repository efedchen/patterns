public class TemplateMethodDemo {
    public static void main(String[] args) {
        Sourdough sourdough = new Sourdough();
        sourdough.make();
        System.out.println("___________");

        TwelveGrain twelveGrain = new TwelveGrain();
        twelveGrain.make();
        System.out.println("___________");

        WholeWheat wholeWheat = new WholeWheat();
        wholeWheat.make();


    }
}
