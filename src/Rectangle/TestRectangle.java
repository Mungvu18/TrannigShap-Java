package Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle("red",false,23,32);
        System.out.println(rectangle);
    }
}
