public class Calculator {
    public int num1, num2, num3, num4;
    public void add(int num1, int num2) {
        int toplam1 = num1 + num2;
        System.out.println("1. Toplam: " + toplam1);
    }

    /* AYNI TÜR FONKSİYON FARKLI SAYIDA PARAMETRE
    public void add(int num1, int num2, int num3) {
        int toplam2 = num1 + num2 + num3;
        System.out.println("2. Toplam: " + toplam2);
    }
     */

    // FARKLI TÜR FONKSİYON FARKLI SAYIDA PARAMETRE
    public double add(double num1, double num2, double num3) {
        double toplam2 = num1 + num2 + num3;
        return toplam2;
    }
}
