import PizzaStore.PizzaStore;
import PizzaStore.NYPizzaStore;
import PizzaStore.ChicagoPizzaStore;

public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}