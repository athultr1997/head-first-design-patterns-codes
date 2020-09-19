import java.util.Iterator;

public class DinerIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalArgumentException("You can't remove an item without performing atleast one next()");
        } else if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); ++i) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}