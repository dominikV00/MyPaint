package shapes;

public class DemoShapesNoUI {
    public static void main(String[] args) {

        MyBagOfShapes mbs = new MyBagOfShapes();
        MyCircle circle1 = new MyCircle(new MyPoint(300, 300), 100);
        MyRectangle rectangle1 = new MyRectangle(new MyPoint(100, 200), 50, 100);
        MyRectangle rectangle2 = new MyRectangle(new MyPoint(350, 500), 150, 40);

        mbs.addShape(circle1);
        mbs.addShape(rectangle1);
        mbs.addShape(rectangle2);


    }
}
