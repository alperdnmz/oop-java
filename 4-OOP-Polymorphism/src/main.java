public class main {
    public static void main(String[] args) {
        Cat cat1, cat2, cat3;
        cat1 = new Cat("Tarçın", 2);
        cat2 = new VanCat("Tekir", 4, true);
        cat3 = new VanCat("Sarıgiller", 1, false);

        cat1.printCat();
        cat2.printCat();
        cat3.printCat();
    }
}
