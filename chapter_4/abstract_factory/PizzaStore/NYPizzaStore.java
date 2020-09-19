package PizzaStore;

import PizzaIngredientFactory.NYPizzaIngredientFactory;
import PizzaIngredientFactory.PizzaIngredientFactory;

import Pizza.Pizza;
import Pizza.CheesePizza;
import Pizza.ClamPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory =
            new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
