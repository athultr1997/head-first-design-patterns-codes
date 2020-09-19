public class DuckCall {

    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void display() {
        System.out.println("This is a duck call. Not an acutal duck.");
    }

}