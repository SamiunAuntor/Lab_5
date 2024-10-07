abstract class Shape implements Comparable<Shape> {

    public int xCoordinate, yCoordinate;

    public Shape(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public abstract double calculateArea();

    @Override
    public int compareTo(Shape otherShape) {
        if (this.calculateArea() < otherShape.calculateArea()) {
            return -1;
        }
        if (this.calculateArea() > otherShape.calculateArea()) {
            return 1;
        } else {
            if (this.xCoordinate < otherShape.xCoordinate) {
                return -1;
            }
            if (this.xCoordinate > otherShape.xCoordinate) {
                return 1;
            } else {
                if (this.yCoordinate < otherShape.yCoordinate) {
                    return -1;
                }
                if (this.yCoordinate > otherShape.yCoordinate) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
