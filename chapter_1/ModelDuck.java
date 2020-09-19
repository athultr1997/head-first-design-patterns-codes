public class ModelDuck extends Duck {
    
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    public void display() {
        System.out.println("Hey I am a Model Duck.");
    }
}