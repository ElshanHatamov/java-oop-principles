package encapsulation_task4;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setProductName("Asus VivoBook");
        product.setProductCode("X1050");
        product.setPrice(1800);
        System.out.println(product.getPrice());

        product.applyDiscount(10);

        System.out.println("Markanin adi: " + product.getProductName());
        System.out.println("Markanin kodu: " + product.getProductCode());
        System.out.println("Nagd alisda: " + product.getPrice() + " AZN - qeder endirim sizi gozleyir");


    }
}
