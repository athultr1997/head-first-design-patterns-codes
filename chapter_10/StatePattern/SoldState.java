public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, a gumball is being sold right now.");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, the quarter cannot be ejected now.");
    }

    public void turnCrank() {
        System.out.println("You have already turned the crank.");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops. Sorry, we are out of gumballs.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}