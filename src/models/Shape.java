package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    // container of Points (e.g. ArrayList<Point>)
    public Shape() {
        this.points = new ArrayList<>();
    }

    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        points.add(point);
    }

    // calculatePerimeter()


    // getAverageSide()

    // getLongestSide()
}
