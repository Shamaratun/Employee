package JaMeme;

public class CircleCircle extends Shape {
    private double radius;

    public CircleCircle(double radius) throws NegNumException {
        if (radius < 0) {
            throw new NegNumException("Negative number not Supported");
        }
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }


}
