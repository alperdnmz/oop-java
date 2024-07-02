public class Main {
    public static void main(String[] args) {

        VanCat cat1 = new VanCat();
        TekirCat cat2 = new TekirCat();
        SarmanCat cat3 = new SarmanCat();

        cat1.name = "Poseidon";
        cat1.color = "White";
        cat1.age = 2;
        cat1.hungry = 6;

        cat2.name = "Hades";
        cat2.color = "Brown";
        cat2.age = 5;
        cat2.hungry = 2;

        cat3.name = "Zeus";
        cat3.color = "Yellow";
        cat3.age = 1;
        cat3.hungry = 3;

        System.out.println(cat1.name + " | " + cat1.color + " | " + cat1.age + " | " + cat1.hungry);
        System.out.println(cat2.name + " | " + cat2.color + " | " + cat2.age + " | " + cat2.hungry);
        System.out.println(cat3.name + " | " + cat3.color + " | " + cat3.age + " | " + cat3.hungry);
    }
}