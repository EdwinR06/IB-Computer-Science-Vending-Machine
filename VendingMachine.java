public class VendingMachine {
    private Coil[] coils;
    private Button[] buttons;
    private int size;
    private double payment;

    public VendingMachine(int size, int slots) {
        this.coils=new Coil[size];
        this.buttons=new Button[size];
        this.size=size;
        this.payment=0;

        makeButtons();
        makeCoils(slots);

    }

    private void makeButtons(){
        for(int i=0; i<this.size; i++){
            this.buttons[i]=new Button(i);
        }
    }

    private void makeCoils(int slots){
        for(int i = 0; i < this.size; i++){
            this.coils[i] = new Coil(i, slots);
        }
    }

    public void setCost(int button, double cost) {
        this.buttons[button].setCost(cost);
    }

    public void setItemName(int button, String name) {
        this.buttons[button].setItemName(name);
    }

    public void refill(int coil) {
        this.coils[coil].refill();
    }

    public void makePayment(double amount) {}

    public void pressButton(int button) {}

    // private double calculateChange(double amountInput, double cost) {}
}
