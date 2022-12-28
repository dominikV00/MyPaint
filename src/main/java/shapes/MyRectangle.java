package shapes;

public class MyRectangle extends MyShape {

    MyPoint star;
    int width;
    int height;

    public MyRectangle(MyPoint star, int width, int height) {
        this.star = star;
        this.width = width;
        this.height = height;
    }

    public MyPoint getStar() {
        return star;
    }

    public void setStar(MyPoint star) {
        this.star = star;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFillC() {
        return fillC;
    }

    public void setFillC(int fillC) {
        this.fillC = fillC;
    }

    int fillC = 3;// 1 red, 2 green, 3 blue

    public MyPoint getStart() {
        return star;
    }

    public void setStart(MyPoint start) {
        this.star = start;
    }
}
