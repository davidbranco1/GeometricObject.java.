abstract class GeometricObject {
    protected String color; // Changed from private to protected

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }
}
