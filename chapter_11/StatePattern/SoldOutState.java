public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Oops. Sorry. We are sold out.");
    }

    public void ejectQuarter() {
        System.out.println("You have not inserted any quarters.");
    }

    public void turnCrank() {
        System.out.println("Oops. Sorry. We are sold out.");
    }

    public void dispense() {
        System.out.println("Oops. Sorry. We are sold out.");
    }
}