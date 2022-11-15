public class VendingMachine {
    private Coil[] coils;
    private Button[] buttons;
    private int size;
    private double payment;


    public VendingMachine(int size) {
        this.coils=new Coil[size];
        this.buttons=new Button[size];
        this.size=size;
        this.payment=0;
    }

    public void setCost(int button, double cost) {}

    public void refill(int coil) {}

    public void makePayment(double amount) {}

    public void pressButton(int button) {}

    // private double calculateChange(double amountInput, double cost) {}
}
