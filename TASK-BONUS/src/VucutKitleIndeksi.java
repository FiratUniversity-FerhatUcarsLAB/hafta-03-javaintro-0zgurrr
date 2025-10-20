import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu girin (kg): ");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu girin (metre cinsinden): ");
        double boy = input.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz (BMI): " + bmi);
    }
}
