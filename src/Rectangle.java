class Rectangle extends Shape {

    private int height, width;

    public Rectangle(int xCoordinate, int yCoordinate,int height, int width) {
        super(xCoordinate, yCoordinate);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
