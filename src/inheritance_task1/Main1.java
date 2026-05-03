package inheritance_task1;

public class Main1 {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();

        animal.makeSound();

        cat.makeSound();

        cat.createSound();
    }
}
