import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    String name;
    String description;
    private ArrayList<MenuComponent> children;
    private Iterator<MenuComponent> iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        children = new ArrayList<MenuComponent>();
    }

    public void add(MenuComponent menuComponent) {
        children.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return children.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("\n" + getName() + ": " + getDescription());
        System.out.println("--------------------------------------");

        Iterator<MenuComponent> iterator = children.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(children.iterator());
        }
        return iterator;
    }
}