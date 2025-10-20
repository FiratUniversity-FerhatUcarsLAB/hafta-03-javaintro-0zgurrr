public class CarpimTablosu {
    public static void main(String[] args) {

        // FOR DÖNGÜSÜ KULLANILMIŞTIR

        int sayi = 2;  // 2’nin çarpım tablosu

        System.out.println(sayi + " sayısının çarpım tablosu:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi * i));
        }
    }
}
