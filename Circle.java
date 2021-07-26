package Draw;

public class Circle extends Shape{
    private double radius;

    @Override
    public int getNumOfSides() {
        return 0;
    }

    @Override
    public int getArea() {
        double pi = 3.14;
        double result = pi * this.radius * this.radius;
        return (int) result;
    }
}
