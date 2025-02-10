public class EquilateralTriangle extends nSidedRegularPolygon {
    public EquilateralTriangle(double sideLength) {
        super(3, sideLength, GeoColors.RED.toString());
    }

    @Override
    public String toString() {
        return "EquilateralTriangle: " + super.toString();
    }
}
