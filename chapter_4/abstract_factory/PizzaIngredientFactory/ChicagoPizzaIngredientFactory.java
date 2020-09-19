package PizzaIngredientFactory;

import Ingredients.Dough.Dough;
import Ingredients.Dough.ThickCrustDough;

import Ingredients.Sauce.Sauce;
import Ingredients.Sauce.PlumTomatoSauce;

import Ingredients.Cheese.Cheese;
import Ingredients.Cheese.MozzarellaCheese;

import Ingredients.Veggies.Veggies;
import Ingredients.Veggies.Spinach;
import Ingredients.Veggies.BlackOlives;
import Ingredients.Veggies.EggPlant;

import Ingredients.Pepperoni.Pepperoni;
import Ingredients.Pepperoni.SlicedPepperoni;

import Ingredients.Clams.Clams;
import Ingredients.Clams.FrozenClams;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}