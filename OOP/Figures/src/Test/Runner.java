package Test;

import Model.Rectangle;
import Model.Square;


public class Runner {

    public static void main(String[] args) {
        // Instance of the utilities class
        Utilitys utilTest = new Utilitys();

        // Instaces to test the features
        Rectangle testRectangle = new Rectangle(5,2);
        Square testSquare = new Square(5);


        // Test of calculateArea Methods
        utilTest.printArea(testRectangle);
        utilTest.printArea(testSquare);

        // Test of calculatePerimeter Methods
        utilTest.printPerimeter(testRectangle);
        utilTest.printPerimeter(testSquare);
    }
}
