public class Ellipse extends GeometricObject implements Eccentric, Comparable<Ellipse>, Cloneable {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(double a, double b, String color) {
        super(color);
        if (a < b) { // Ensure a is always the major axis
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return Math.PI * a * b;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }

    @Override
    public double getEccentricity() {
        return Math.sqrt(1 - (b * b) / (a * a));
    }

    @Override
    public int compareTo(Ellipse other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    @Override
    public Ellipse clone() {
        try {
            return (Ellipse) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Ellipse: a=" + a + ", b=" + b + "; " + super.toString();
    }
}
