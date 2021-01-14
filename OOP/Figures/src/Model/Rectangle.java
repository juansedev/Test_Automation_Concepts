package Model;

public class Rectangle implements iFigure {

    private int sideA, sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return  this.sideA * this.sideB;
    }

    @Override
    public  double calculatePerimeter() {
        return  2 * (this.sideB + this.sideA);
    }
}
