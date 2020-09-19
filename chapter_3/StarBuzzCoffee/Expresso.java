public class Expresso extends Beverage {
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 32.0;
    }
}