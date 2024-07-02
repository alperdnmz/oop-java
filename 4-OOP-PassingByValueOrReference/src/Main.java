import com.sun.jdi.ArrayReference;

public class Main {
    public static void main(String[] args) {

        /* PASS BY VALUE
        // 2 tane statik method var. ikinci methoda parametre olarak kopyası geçirildi.
        // Sayının değeri değişmez.
        int number=5; //static variable
        System.out.println("Previous value of number: " + number);
        changeTheValue(number);
        System.out.println("Current value of number: " + number);
         */

        /* PASS BY REFERENCE
        PassByReference reference = new PassByReference();
        reference.number2=7;
        System.out.println("Previous value of number: " + reference.number2);
        reference.change(reference);
        System.out.println("Current value of number: " + reference.number2);
         */

        /* ARRAY AS A REFERENCE
        int [] array = new int[] {2,4,6};
        System.out.println("Previous first element of array: " + array[0]);
        ArrayAsAReference arrayReference = new ArrayAsAReference();
        arrayReference.changeTheArray(array);
        System.out.println("Current first element of array: " + array[0]);
         */
    }

    /* PASS BY VALUE FUNCTION
    public static void changeTheValue(int number) {
        number=number+10;
    }
     */
}
