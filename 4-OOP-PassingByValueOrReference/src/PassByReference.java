public class PassByReference {
    public int number2; //instance variables
    public void change(PassByReference reference){
        reference.number2 = reference.number2 + 8;
    }
}