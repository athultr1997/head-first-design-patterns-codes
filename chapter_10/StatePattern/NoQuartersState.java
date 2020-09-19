public class NoQuartersState implements State {
    GumballMachine gumballMachine;

    public NoQuartersState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You have inserted a quarter successfully.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You have not inserted any quarters to be ejected.");
    }

    public void turnCrank() {
        System.out.println("You have not inserted any quarters to turn the crank.");
    }

    public void dispense() {
        System.out.println("You need to insert quarter first to dispense gumballs.");
    }

}