public class GumballMachine {
    State noQuartersState;
    State hasQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;

    State currentState;
    int gumballCount;

    public GumballMachine(int gumballCount) {
        noQuartersState = new NoQuartersState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new  WinnerState(this);

        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            this.currentState = noQuartersState;
        } else {
            this.currentState = soldOutState;
        }
    }

    public void insertCoin() {
        currentState.insertQuarter();
    }

    public void ejectCoin() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void releaseBall() {
        System.out.println("A gumball is being released. Please collect.");
        if (gumballCount > 0) {
            gumballCount -= 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuartersState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void refill(int count) {
        gumballCount += count;
        setState(getNoQuarterState());
        System.out.println("The machine has been refilled to " + getGumballCount() + " gumballs");
    }
}