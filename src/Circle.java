class Circle extends Shape {
    private int radius;

    public Circle(int xCoordinate, int yCoordinate, int radius) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
