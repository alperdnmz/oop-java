public class Main {
    /* 1.YOL
    public static int sayi2=8;
     */

    /* 2.YOL
    public int sayi2=8;
     */

    public static void main(String[] args) {

        /*
        int sayi1 = 5;
        sayi1 = 7;
        System.out.println(sayi1);
         */

        // statik ve statik olmayan alanlarda verilerle bağlantı kurma
        // statik alanda statik olmayan alandaki verileri kontrol edemeyiz.
        // bu durumu iki yolla çözeriz.
        // 1- statik olmayan alandaki veriyi statik olarak tanımlamak
        // 2- veriye ait sınıftan nesne üretmek

        /* 1. yol
        //sayi2=16;
        //System.out.println(sayi2);
         */

        /* 2. yol
        Main main = new Main();
        main.sayi2 = 16;
        System.out.println(main.sayi2);
         */

        /*
        Person person1 = new Person();
        Person person2 = new Person();

        person1.firstName="Charles";
        person2.firstName="Jules";
        person1.lastName="LECLERC";
        person2.lastName="BIANCHI";
        person1.age=27;
        person2.age=38;
        person1.height=180;
        person2.height=183;
        person1.weight=80;
        person2.weight=70;

        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.age + " " + person1.height + " " + person1.weight + " " + person2.weight);
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.age + " " + person2.height + " " + person2.weight + " " + person2.weight);
         */

        Audi A6 = new Audi();
        Audi Q7 = new Audi();
        System.out.println(A6.numberOfGears);
        System.out.println(Q7.numberOfGears);
    }
}