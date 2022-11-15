public class Coil {
    private int numSlots;
    private int position;
    private int itemsRemaining;

    public Coil(int position, int numSlots) {
        this.numSlots=numSlots;
        this.position=position;
        this.itemsRemaining=numSlots;


    }

    public void spin() {}

    public int getItemsRemaining() {
        return this.itemsRemaining;
    }

    public void refill() {}

    private void sendRestockAlert() {}
}
