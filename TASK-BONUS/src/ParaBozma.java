import java.util.Scanner;

public class ParaBozma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Toplam parayı girin (TL): ");
        int toplam = input.nextInt();

        int yuzluk = toplam / 100;
        toplam = toplam % 100;

        int ellilik = toplam / 50;
        toplam = toplam % 50;

        int yirmilik = toplam / 20;
        toplam = toplam % 20;

        int beslik = toplam / 5;
        toplam = toplam % 5;

        int ikilik = toplam / 2;
        toplam = toplam % 2;

        int birlik = toplam;

        System.out.println("Sonuç:");
        System.out.println(yuzluk + " tane 100 TL");
        System.out.println(ellilik + " tane 50 TL");
        System.out.println(yirmilik + " tane 20 TL");
        System.out.println(beslik + " tane 5 TL");
        System.out.println(ikilik + " tane 2 TL");
        System.out.println(birlik + " tane 1 TL");
    }
}
