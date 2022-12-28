package com.example.mypaint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import shapes.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MyBagOfShapes mbs = new MyBagOfShapes();
        MyCircle circle1 = new MyCircle(new MyPoint(300, 300), 100);
        MyRectangle rectangle1 = new MyRectangle(new MyPoint(100, 200), 50, 100);
        MyRectangle rectangle2 = new MyRectangle(new MyPoint(350, 500), 150, 40);
        MyPoly tri = new MyPoly((new MyPoint(10, 10)), (new MyPoint(50, 50)), (new MyPoint(150, 100)));

        mbs.addShape(circle1);
        mbs.addShape(rectangle1);
        mbs.addShape(rectangle2);

        drawShapeInJavaFx(mbs, stage);
    }

    private void drawShapeInJavaFx(MyBagOfShapes mbs, Stage stage) {
        Group group = new Group();

        MyShape[] shape = mbs.getShapes();
        for(int i = 0;i<shape.length;i++) {
            if(shape[i] instanceof MyCircle) {
                Circle circle = new Circle();
                circle.setCenterX(((MyCircle) shape[i]).getCenter().getX());
                circle.setCenterY(((MyCircle) shape[i]).getCenter().getY());
                circle.setRadius(((MyCircle) shape[i]).getRadius());
                group.getChildren().add(circle); // asta de pe net

                if (((MyCircle) shape[i]).getFillC()==1)
                    circle.setFill(Color.RED);
                else if (((MyCircle) shape[i]).getFillC()==2)
                    circle.setFill(Color.GREEN);
                else if (((MyCircle) shape[i]).getFillC()==3)
                    circle.setFill(Color.BLUE);
            }
            else
            if(shape[i] instanceof MyRectangle) {
                Rectangle rectangle = new Rectangle();
                rectangle.setX(((MyRectangle) shape[i]).getStart().getX());
                rectangle.setY(((MyRectangle) shape[i]).getStart().getY());
                rectangle.setWidth(((MyRectangle) shape[i]).getWidth());
                rectangle.setHeight(((MyRectangle) shape[i]).getHeight());

                if(((MyRectangle) shape[i]).getFillC()==1)
                    rectangle.setFill(Color.RED);
                else
                if(((MyRectangle) shape[i]).getFillC()==2)
                    rectangle.setFill(Color.GREEN);
                else
                if(((MyRectangle) shape[i]).getFillC()==3)
                    rectangle.setFill(Color.BLUE);


                group.getChildren().add(rectangle); // asta de pe net
            }

            else
            if(shape[i] instanceof MyPoly)
            {
                Polygon p = new Polygon();

                p.getPoints().addAll(new Double[] {
                        Double.valueOf(((MyPoly) shape[i]).getPoint1().getX()), Double.valueOf(((MyPoly) shape[i]).getPoint1().getY()),
                        Double.valueOf(((MyPoly) shape[i]).getPoint2().getX()), Double.valueOf(((MyPoly) shape[i]).getPoint2().getY()),
                        Double.valueOf(((MyPoly) shape[i]).getPoint3().getX()), Double.valueOf(((MyPoly) shape[i]).getPoint3().getY())});

                group.getChildren().add(p); // asta de pe net
            }
        }

        // set the scene, as found on internet for java fx
        Scene scene = new Scene(group, 1000, 1000);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}