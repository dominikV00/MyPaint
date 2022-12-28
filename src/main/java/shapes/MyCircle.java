package shapes;

public class MyCircle extends MyShape {
    MyPoint center;
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void save() {
    }

    public void open() {
    }

    public int getFillC() {
        return fillC;
    }

    public void setFillC(int fillC) {
        this.fillC = fillC;
    }

    int fillC = 1;// 1 red, 2 green, 3 blue
}
