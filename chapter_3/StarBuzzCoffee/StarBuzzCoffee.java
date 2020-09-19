public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Expresso();
        System.out.println(
            beverage1.getDescription() +
            ": Rs." + beverage1.cost()
        );

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(
            beverage2.getDescription() +
            ": Rs." + beverage2.cost()
        );
    }
}