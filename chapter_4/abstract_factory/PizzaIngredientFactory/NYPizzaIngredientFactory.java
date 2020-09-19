
package PizzaIngredientFactory;

import Ingredients.Dough.Dough;
import Ingredients.Dough.ThinCrustDough;

import Ingredients.Cheese.Cheese;
import Ingredients.Cheese.ReggianoCheese;

import Ingredients.Sauce.Sauce;
import Ingredients.Sauce.MarinaraSauce;

import Ingredients.Veggies.Veggies;
import Ingredients.Veggies.Garlic;
import Ingredients.Veggies.Mushroom;
import Ingredients.Veggies.Onion;
import Ingredients.Veggies.Redpepper;

import Ingredients.Pepperoni.Pepperoni;
import Ingredients.Pepperoni.SlicedPepperoni;

import Ingredients.Clams.Clams;
import Ingredients.Clams.FreshClams;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new Redpepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}