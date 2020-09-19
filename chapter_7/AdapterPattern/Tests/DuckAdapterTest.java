package Tests;

import Turkey.Turkey;
import Turkey.DuckAdapter;
import Turkey.WildTurkey;
import Duck.MallardDuck;

public class DuckAdapterTest {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();

        MallardDuck mallardDuck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        System.out.println("The duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe turkey says...");
        testTurkey(wildTurkey);

        System.out.println("\nThe duck adapter says...");
        testTurkey(duckAdapter);
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}