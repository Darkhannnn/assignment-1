import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/darkhansmagulov/IdeaProjects/assignment11/src/source");

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
//            shape.addPoint(point);
        }
    }
}