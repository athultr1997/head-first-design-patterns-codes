import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private HashMap<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems  = new HashMap<String, MenuItem>();
        addItem(
            "Veggie Burger and Fries",
            "Veggies burgers with tomato, bun, lettuce, and sauce",
            true,
            3.98
        );
        addItem(
            "Chocolate Milk Shake",
            "Milk shake with a lot of chocolate and ice-cream",
            true,
            2.56
        );
        addItem(
            "Coffee",
            "Coffee in any variety you like",
            true,
            1.45
        );
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}