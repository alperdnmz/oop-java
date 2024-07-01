public class Car {
    public String brand;
    public String color;
    public String model;
    public int speed;
    public int price;

    public Car(){
        this.brand = "Marka GİRİLMEDİ!";
        this.color = "Renk GİRİLMEDİ!";
        this.model = "Model GİRİLMEDİ!";
        this.speed = 0;
        this.price = 0;
    }

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void speedUp(int increment){
        this.speed = this.speed + increment;
    }

    void applyBrake(int decrement){
        this.speed = this.speed - decrement;
    }

    void printStates(){
        System.out.println(" Brand:" + this.brand + " Model:" + this.model + " Color:" + this.color + " Speed:" + this.speed + " Price:" + this.price);
    }
}
