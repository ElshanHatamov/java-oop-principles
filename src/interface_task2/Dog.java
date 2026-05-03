package interface_task2;

public class Dog implements Animal {
    @Override
    public void bark() {

        System.out.println("Dog is barking");
    }

    void speak() {
        System.out.println("Dog is speaking");
    }
}
