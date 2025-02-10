public class Octagon extends nSidedRegularPolygon {
    public Octagon(double sideLength) {
        super(8, sideLength, GeoColors.PURPLE.toString());
    }

    @Override
    public String toString() {
        return "Octagon: " + super.toString();
    }
}
