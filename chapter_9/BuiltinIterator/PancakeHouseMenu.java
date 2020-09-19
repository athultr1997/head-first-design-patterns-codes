import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem(
            "K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs and toast",
            true,
            2.99
        );
        addItem(
            "Regular Pancake Breakfast",
            "Pancakes with fried eggs and sausage",
            false,
            3.45
        );
        addItem(
            "Blueberry Pancakes",
            "Pancakes with fresh blueberries",
            true,
            3.76
        );
        addItem(
            "Waffles",
            "Waffles with blueberries or starwberries",
            false,
            3.76
        );
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}