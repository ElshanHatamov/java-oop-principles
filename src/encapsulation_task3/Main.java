package encapsulation_task3;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(8.0);
        rectangle.setWidth(12.0);

        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
