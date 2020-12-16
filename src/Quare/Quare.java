package Quare;

import Rectangle.Rectangle;

public class Quare extends Rectangle {
    public Quare() {
    }

    public Quare(String color, boolean filled) {
        super(color, filled);
    }
    public Quare( double side){
        super(side,side);
    }
    public double getArea(double side){
        return Math.pow(side,2);
    }
    public double getP(double side){
        return side*4;
    }

    @Override
    public String toString() {
        return " Quare{ "+" color "+getColor()+
                " fill "+isFilled()+" Area " + getArea(getWidth()) + " P "+
                getP(getWidth())
                +"}";
    }
}
