public class VendingMachine {
    private Coil[] coils;
    private Button[] buttons;
    private int size;
    private double payment;
    private int slots;

    public VendingMachine(int size, int slots) {
        this.coils=new Coil[size];
        this.buttons=new Button[size];
        this.size=size;
        this.payment=0;
        this.slots=slots;

        makeButtons();
        makeCoils();

    }

    private void makeButtons(){
        for(int i=0; i<this.size; i++){
            this.buttons[i]=new Button(i);
        }
    }

    private void makeCoils(){
        for(int i=0; i<this.size; i++){
            this.coils[i]=new Coil(i, this.slots);
        }
    }

    public void setCost(int button, double cost) {}

    public void refill(int coil) {}

    public void makePayment(double amount) {}

    public void pressButton(int button) {}

    // private double calculateChange(double amountInput, double cost) {}
}
