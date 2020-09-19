public class DuckSimulator {

    public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();

        model.setFlyBehaviour(new FlyRocketPowered());
        model.setQuackBehaviour(new Squeek());
        model.performQuack();
        model.performFly();

        DuckCall duckCall = new DuckCall();
        duckCall.setQuackBehaviour(new Squeek());
        duckCall.performQuack();
    }

}
