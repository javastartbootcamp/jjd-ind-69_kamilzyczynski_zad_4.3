package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(5);
        System.out.println("Square area is: ");
        double squareArea = shapeCalculator.calculateSquareArea(square);
        System.out.println(squareArea);

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Perimeter of rectangle is: ");
        double rectPerimeter = shapeCalculator.calculateRectPerimeter(rectangle);
        System.out.println(rectPerimeter);

        Circle circle = new Circle(2);
        System.out.println("Circle area is: ");
        double circleArea = shapeCalculator.calculateCircleArea(circle);
        System.out.println(circleArea);

        Triangle triangle = new Triangle(6, 7, 9);
        System.out.println("Perimeter of triangle is: ");
        double trianglePerimeter = shapeCalculator.calculateTrianglePerimeter(triangle);
        System.out.println(trianglePerimeter);

    }
}
