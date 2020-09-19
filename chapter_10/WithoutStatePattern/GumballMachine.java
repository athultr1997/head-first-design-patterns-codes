public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int countOfGumballs;

    public GumballMachine(int countOfGumballs) {
        this.countOfGumballs = countOfGumballs;
        if (countOfGumballs > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("A quarter was inserted");
        } else if (state == HAS_QUARTER) {
            System.out.println("There is already a quarter inserted. Sorry.");
        } else if (state == SOLD_OUT) {
            System.out.println("The gumballs are sold out. Sorry.");
        } else if (state == SOLD) {
            System.out.println("Please wait. A gumball is being sold. Sorry.");
        }
    }

    public void ejectQuarter() {
        if (state == NO_QUARTER) {
            System.out.println("No quarter to eject. Sorry.");
        } else if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("A quarter was ejected.");
        } else if (state == SOLD_OUT) {
            System.out.println("You have not inserted a quarter to eject.");
        } else if (state == SOLD) {
            System.out.println("Sorry, you have already turned the crank.");
        }
    }
    
    public void turnCrank() {
        if (state == NO_QUARTER) {
            System.out.println("The crank has been turned, but there was no quarter.");
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            dispense();
            System.out.println("The crank has been turned successfully.");
        } else if (state == SOLD_OUT) {
            System.out.println("The crank has been turned, but the gumballs are sold out. Sorry.");
        } else if (state == SOLD) {
            System.out.println("The gumball has already been sold.");
        }
    }

    public void dispense() {
        if (state == NO_QUARTER) {
            System.out.println("You need to insert quarter first.");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball was dispensed because the crank was not pulled.");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball was dispensed because the gumballs are sold out.");
        } else if (state == SOLD) {
            System.out.println("Please collect the disepnsed gumball. Thank You !!");
            countOfGumballs -= 1;
            if (countOfGumballs == 0) {
                state = SOLD_OUT;
                System.out.println("Oops! We are out of gumballs.");
            } else {
                state = NO_QUARTER;
            }
        }
    }

    public String toString() {
        return "State: " + state + ", Count of Gumballs: " + countOfGumballs;
    }

    public void refill(int refillcountOfGumballs) {
        countOfGumballs += refillcountOfGumballs;
    }
}