import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(1, 1, 4));
        shapes.add(new Circle(2, 2, 5));
        shapes.add(new Rectangle(3, 3, 5, 3));

        OrderPrinter printer = new OrderPrinter();
        printer.print(shapes);
    }
}