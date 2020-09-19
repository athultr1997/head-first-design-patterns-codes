package PizzaStore;

import PizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import PizzaIngredientFactory.PizzaIngredientFactory;

import Pizza.Pizza;
import Pizza.CheesePizza;
import Pizza.ClamPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory =
            new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
