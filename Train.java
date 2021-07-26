public class Train extends Vehicle{
    String classification;


    public Train(int inputCapacity, int inputCost, String inputClassification) {
        //super(inputCapacity, "On the road", inputCost);
        this.classification = inputClassification;
    }


    @Override
    public void printHello() {

    }
}
