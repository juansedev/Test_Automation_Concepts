package Model;

public class Square extends Figure{

    private int side;

    public Square(int side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }
}
