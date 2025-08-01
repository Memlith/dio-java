
public record Circle(double radius) implements GeometricForm {

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

}
