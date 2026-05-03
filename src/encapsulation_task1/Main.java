package encapsulation_task1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Elshan");
        person.setAge(23);
        person.setCountry("Azerbaijan");
    // Asagida qeyd olunan her iki metodda uygundur ve islyeir.....
        String ad = person.getName();
        int yas = person.getAge();
        String olke = person.getCountry();

        System.out.println("Adi: " + ad);
        System.out.println("Yasi: " + yas);
        System.out.println("Doguldugu olke: " + olke);

        System.out.println("Adi: " + person.getCountry());
        System.out.println("Yasi: " + person.getAge());
        System.out.println("Doguldugu olke: " + person.getCountry());
    }
}
