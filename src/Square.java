public class Square extends nSidedRegularPolygon {
    public Square(double sideLength) {
        super(4, sideLength, GeoColors.GREEN.toString());
    }

    @Override
    public String toString() {
        return "Square: " + super.toString();
    }
}
