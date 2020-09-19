package PizzaIngredientFactory;

import Ingredients.Cheese.Cheese;
import Ingredients.Clams.Clams;
import Ingredients.Dough.Dough;
import Ingredients.Sauce.Sauce;
import Ingredients.Veggies.Veggies;
import Ingredients.Pepperoni.Pepperoni;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}