package Tests;

import Duck.Duck;
import Duck.MallardDuck;
import Duck.TurkeyAdapter;
import Turkey.WildTurkey;

public class TurkeyAdapterTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdpater = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe turkey adapter says...");
        testDuck(turkeyAdpater);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}