import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem(
            "Vegetarian BLT",
            "Bacon with lettuce and tomato in whole wheat",
            true,
            4.78d
        );
        addItem(
            "BLT",
            "Bacon with lettuce and tomato on whole wheat",
            false,
            5.34
        );
        addItem(
            "Soup of the day",
            "Soup of the day with potatoe chips",
            false,
            3.54
        );
        addItem(
            "Hotdog",
            "A regular hotdog with any sauce",
            true,
            5.77
        );
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, the menu is full. Can't add more items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerIterator(menuItems);
    }
}