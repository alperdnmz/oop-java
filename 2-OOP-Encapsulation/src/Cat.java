class Cat {
    public String name;
    public String color;
    private int age;
    int hungry;

    //main constructor
    public Cat() {
        this.name = "Kedinin ismi GİRİLMEMİŞ!";
        this.color = "Kedinin rengi GİRİLMEMİŞ!";
        this.age = 0;
        this.hungry = 0;
    }

    //parameters constructor
    public Cat(String name, String color, int age, int hungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hungry = hungry;
    }

    //getter age
    public int getAge() {
        return age;
    }

    //setter age
    public void setAge(int age) {
        this.age = age;
    }
}
