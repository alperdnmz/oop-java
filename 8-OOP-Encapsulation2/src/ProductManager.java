public class ProductManager {
    public void add(Product product) { //object referer
        System.out.println("Product added to database");
        product.setID("JBL T600 BlueTooth");
        System.out.println("Product ID: " + product.getID());
    }
}
