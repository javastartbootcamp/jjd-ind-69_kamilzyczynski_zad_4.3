package pl.javastart.task;

public class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        return Math.pow(square.getA(), 2);
    }

    public double calculateCircleArea(Circle circle) {
        return 3.14 * Math.pow(circle.getR(), 2);
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getA() + rectangle.getB());
    }
}
