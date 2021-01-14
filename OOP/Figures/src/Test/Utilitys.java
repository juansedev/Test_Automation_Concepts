package Test;

import Model.Figure;

public class Utilitys {

    public void printArea(Figure figure) {
        System.out.println("The area of the " + figure.getClass() + " is "+ figure.calculateArea());
    }

    public void printPerimeter(Figure figure) {
        System.out.println("The perimter of the " + figure.getClass() + " is "+ figure.calculatePerimeter());
    }
}
