import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You have already inserted a quarter.");
    }

    public void ejectQuarter() {
        System.out.println("The quarter you have inserted has been ejected successfully.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You have turned the crank successfully.");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getGumballCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("You have to pull the crank first.");
    }
}