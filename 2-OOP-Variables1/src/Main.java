public class Main {
    public static void main(String[] args) {
        /*
        int sayi1=4;
        int sayi2=8;
        sayi1=sayi2;
        sayi1=16;
        System.out.println(sayi1);
         */

        /* Shallow COPY
        // tek kopya var. numbers2 numbers1'in point ettiği diziyi gösterir.
        int [] numbers1 = {10,20,30,40,50};
        int [] numbers2 = {11,22,33,44,55};
        numbers2=numbers1;
        numbers1[0]=5;
        System.out.println(numbers2[0]);
         */

        /* Deep COPY
        // iki ayrı kopya var. numbers2 numbers1'in verileri doğrudan tutar.
        int [] numbers1 = {10,20,30,40,50};
        int [] numbers2 = {11,22,33,44,55};
        for(int i=0;i<numbers1.length;i++){
            numbers2[i]=numbers1[i];
        }
        for(int i=0;i<numbers2.length;i++){
            System.out.println(numbers2[i]);
        }
        numbers2[1]=64  ; // numbers2 numbers1'i iaret etmediği için sadece numbers2 değişir.
        for(int i=0;i<numbers2.length;i++){
            System.out.println(numbers2[i]);
        }
         */
    }
}
