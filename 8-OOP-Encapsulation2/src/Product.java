public class Product {
    private String ID;
    public String brand;
    public String model;
    public int stockAmount;
    public String color;

    public Product(String brand, String model, int stockAmount, String color) {
        this.brand = brand;
        this.model = model;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    public void setID(String ID) {
        this.ID = ID;
        this.ID = getID().substring(0,3) + getID().substring(4,8) + getID().substring(9,10) + getID().substring(13,14);
    }

    public String getID() {
        return ID;
    }
}
