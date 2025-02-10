public abstract class nSidedRegularPolygon extends GeometricObject implements Comparable<nSidedRegularPolygon>, Cloneable {
    protected int sides;
    protected double sideLength;

    public nSidedRegularPolygon(int sides, double sideLength, String color) {
        super(color);
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double getPerimeter() {
        return sides * sideLength;
    }

    public double getArea() {
        double apothem = sideLength / (2 * Math.tan(Math.toRadians(180.0 / sides)));
        return (getPerimeter() * apothem) / 2;
    }

    @Override
    public int compareTo(nSidedRegularPolygon other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    @Override
    public nSidedRegularPolygon clone() {
        try {
            return (nSidedRegularPolygon) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Sides=" + sides + ", Side Length=" + sideLength + "; " + super.toString();
    }
}
