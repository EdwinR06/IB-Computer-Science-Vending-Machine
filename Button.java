public class Button {
    private double cost;
    private int position;
    public boolean pressed;
    private String itemName;

    public Button(int position) {
        this.cost=cost;
        this.position=position;
        this.pressed=false;
        this.itemName=itemName;

    }

    public void setCost(double cost) {
        this.cost=cost;
    }

    public double getCost() {
        return this.cost;
    }

    public void setItemName(String name) {
        this.itemName=name;
    }

    public String getItemName() {
        return this.itemName;
    }
}
