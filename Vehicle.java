public abstract class Vehicle {
    private int capacity;
    private String type;
    private int cost;

    public int getCapacity() {
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public int getCost() {
        return this.cost;
    }

    public void changeCost(int newCost){
        this.cost = newCost;
    }

    public abstract void printHello();
}
