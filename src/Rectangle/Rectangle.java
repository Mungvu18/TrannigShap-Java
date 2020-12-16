package Rectangle;

import Shap.Shap;

public class Rectangle extends Shap {
    private double width = 1;
    private double height = 2;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(double width,double height){
        return this.width*this.height;
    }
    public double getP(double width, double height){
        return this.height*2+this.width*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height = " + height +
                ", color = "+getColor()+
                ", fill = "+ isFilled()+
                ", area = " + getArea(width,height) +
                ", P = " + getP(width,height)
                + '}';
    }
}
