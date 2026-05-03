package interface_task1;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(5);

        Triangle triangle = new Triangle(10,12);

        Rectangle rectangle = new Rectangle(8,10);

        System.out.println(circle.getArea());

        System.out.println(triangle.getArea());

        System.out.println(rectangle.getArea());

    }
}
