package Garage;

public class Garage {
    Car[] garage;

    public Garage(int size){
        this.garage = new Car[size];
    }

    public void park(Car car, int index){
        this.garage[index] = car;
    }
}
