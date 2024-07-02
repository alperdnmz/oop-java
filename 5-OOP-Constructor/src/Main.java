public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("MacBook", "M3 Max", 7000, 10);
        System.out.println(product1.name + " " + product1.model + " " + product1.price + " " + product1.stockAmount);
        System.out.println(product2.name + " " + product2.model + " " + product2.price + " " + product2.stockAmount);
    }
}
