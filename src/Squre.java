class Square extends Shape {
    private int length;

    public Square(int xCoordinate, int yCoordinate, int length) {
        super(xCoordinate, yCoordinate);
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
