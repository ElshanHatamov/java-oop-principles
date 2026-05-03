package interface_task2;

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.bark();

        System.out.println("--------------");
        Dog b = new Dog();
        b.bark();
        b.speak();
    }
}
