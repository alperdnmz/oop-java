//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car1.brand = "Audi";
        car2.brand = "Mercedes";
        car3.brand = "BMW";

        car1.model = "A6";
        car2.model = "C180";
        car3.model = "i520";

        car1.color = "Black";
        car2.color = "White";

        car1.speed = 300;
        car2.speed = 200;

        car1.price = 2000000;
        car2.price = 1500000;

        car1.printStates();
        car2.printStates();
        car3.printStates();
        car4.printStates();
    }
}