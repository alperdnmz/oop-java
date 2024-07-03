public class Main {
    public static void main(String[] args) {
        Product product = new Product("JBL", "T600 BlueTooth 5.1",40,"Black");
        System.out.println("Product's Brand: " + product.brand + "Product's Model: " + product.model + "Product's Stock Amount: " + product.stockAmount + "Product's Color: " + product.color);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }

    //public void removeProductID(Product product){

    //}
}
