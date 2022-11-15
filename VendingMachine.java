public class VendingMachine {
    private Coil[] coils;
    private Button[] buttons;
    private int size;
    private boolean paid;

    public VendingMachine(int size) {}

    public void setCost(int button, double cost) {}

    public void refill(int coil) {}

    public void makePayment(double amount) {}

    public void pressButton(int button) {}

    // private double calculateChange(double amountInput, double cost) {}
}
