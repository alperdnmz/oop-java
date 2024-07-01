public class Cat {
    private String name;
    private int age;

    //default constructor
    public Cat() {
        this.name = "Kedinin ismi GİRİLMEMİŞ!";
        this.age = -1;
    }

    //parameters constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void printCat(){
        System.out.println("Kedinin Adı: " + this.getName() + "Kedinin Yaşı: " + this.getAge());
    }
}

class VanCat extends Cat{
    private boolean vaccine;

    //parameters constructor
    public VanCat(String name, int age, boolean vaccine) {
        super(name, age);
        this.vaccine = vaccine;
    }

    //get vaccine
    public boolean getVaccine() {
        return vaccine;
    }

    //setter vaccine
    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public void printCat(){
        if(this.vaccine == true){
            System.out.println("Kedinin Adı: " + this.getName() + " | Kedinin Yaşı: " + this.getAge() + "| Kedinizin aşısı YAPILMIŞTIR.");
        }else{
            System.out.println("Kedinin Adı: " + this.getName() + " | Kedinin Yaşı: " + this.getAge() + "| Kedinizin aşısı YAPILMAMIŞTIR. Lütfen aşısını yaptırınız.");
        }
    }
}
