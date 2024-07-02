public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(4, 8);
        //calc.add(4,8,16);
        System.out.println(calc.add(4.5,8.5,16.5));
    }
}
