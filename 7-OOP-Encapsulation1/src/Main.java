public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName="Charles";
        person.lastName="LECLERC";
        person.age=27;
        //person1.email="charles@leclerc.com";

        person.setEmail("lordpercevalcharles@leclerc.com");
        System.out.println(person.getEmail());
    }
}
