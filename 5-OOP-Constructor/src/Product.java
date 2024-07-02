public class Product {
    public String name;
    public String model;
    public int price;
    public int stockAmount;

    public Product() { // default constructor
        this.name = "MacBook";
        this.model = "M3 Pro";
        this.price = 5000;
        this.stockAmount = 20;
    }

    public Product(String name, String model, int price, int stockAmount) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.stockAmount = stockAmount;
    }
}
