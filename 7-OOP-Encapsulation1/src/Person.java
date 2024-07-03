public class Person {
    //attributes
    public String firstName;
    public String lastName;
    public int age;
    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if(email.contains("@")){
            this.email = email;
        }
        else{
            this.email = "Not a valid email address";
        }
    }
}
