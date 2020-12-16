package Quare;

public class TestQuare {

    public static void main(String[] args) {
        Quare quare = new Quare();
        System.out.println(quare);
        quare = new Quare(2);
        quare.setColor("red");
        quare.setFilled(false);
        quare.setWidth(4);
        System.out.println(quare);
    }
}
