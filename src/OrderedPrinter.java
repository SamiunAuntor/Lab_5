import java.util.Collections;
import java.util.List;

class OrderPrinter {

    public void print(List<Shape> shapes) {
        Collections.sort(shapes);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("x Coordinate: " + shape.xCoordinate);
            System.out.println("y Coordinate: " + shape.yCoordinate);

        }
    }
}
