package Test;

import Model.iFigure;

public class Utilitys {

    public void printArea(iFigure figure) {
        System.out.println("The area of the " + figure.getClass() + " is "+ figure.calculateArea());
    }

    public void printPerimeter(iFigure figure) {
        System.out.println("The perimter of the " + figure.getClass() + " is "+ figure.calculatePerimeter());
    }
}
