package Pizza;

import Ingredients.Cheese.Cheese;
import Ingredients.Dough.Dough;
import Ingredients.Sauce.Sauce;
import Ingredients.Veggies.Veggies;
import Ingredients.Clams.Clams;
import Ingredients.Pepperoni.Pepperoni;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking " + name + " for 24 minutes");
    }

    public void cut() {
        System.out.println("Cuting " + name + " into diagonal slices");
    }

    public void box(){
        System.out.println("Boxing " + name + " in the official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
