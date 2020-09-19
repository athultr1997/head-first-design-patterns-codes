public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine Report\n--------------");
        System.out.println("Location: " + gumballMachine.getLocation());
        System.out.println("Inventory: " + gumballMachine.getGumballCount() + " gumballs");
        System.out.println("Current State: " + gumballMachine.getState());
    }
}