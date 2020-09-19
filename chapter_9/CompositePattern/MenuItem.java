import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print(getName() + ": " + getDescription());
        if (isVegetarian()) {
            System.out.print("(Veg)");
        } else {
            System.out.print("(NonVeg)");
        }
        System.out.println("---" + price);
    }

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}