package abstract_task2;

public class Main {
    public static void main(String[] args) {

        double r = 4.0;
        Circle circle = new Circle(r);
        circle.calculateArea();
        System.out.println("Circle perimeter is: " + circle.calculatePerimeter());
        System.out.println("Circle area is: " + circle.calculateArea());

        Triangle triangle = new Triangle(3, 5, 7);
        System.out.println("Triangle area is: " + triangle.calculateArea());
        System.out.println("Triangle perimeter is: " + triangle.calculatePerimeter());
    }
}
