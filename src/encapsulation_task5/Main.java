package encapsulation_task5;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Elshan Hatamov",23);
        Person person2 = new Person("Tarana Tagizade",23);

        System.out.println(person1.getName() + "un " + person1.getAge() + " yasi var");
        System.out.println(person2.getName() + "in " + person2.getAge() + " yasi var");
        System.out.println("-------------------------------");
        System.out.println("Set ve get metodundan sonra output:");

        person1.setAge(25);
        person1.setName("Elshan Hatamov");
        person1.setAge(25);
        person2.setName("Tarana Tagizade");

        System.out.println(person1.getName() + " un indi " + person1.getAge() + " yasi var");
        System.out.println(person2.getName() + " in indi " + person2.getAge() + " yasi var");

    }
}
