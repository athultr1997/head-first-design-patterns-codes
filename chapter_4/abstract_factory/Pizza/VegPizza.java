package Pizza;

import PizzaIngredientFactory.PizzaIngredientFactory;

public class VegPizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public VegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}