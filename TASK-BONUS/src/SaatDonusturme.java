import java.util.Scanner;

public class SaatDonusturme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saniye girin: ");
        int toplamSaniye = input.nextInt();

        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;

        System.out.println("Sonuç: " + saat + ":" + dakika + ":" + saniye);
    }
}
