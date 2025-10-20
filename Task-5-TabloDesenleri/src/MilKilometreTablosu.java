public class MilKilometreTablosu {
    public static void main(String[] args) {
        double mil, km;
        double cevirimOrani = 1.609; // 1 mil = 1.609 km

        // Başlık
        System.out.println("-------------------------");
        System.out.println("| Mil | Kilometre       |");
        System.out.println("-------------------------");

        // Mil değerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};

        for (int i = 0; i < milDegerleri.length; i++) {
            mil = milDegerleri[i];
            km = mil * cevirimOrani;
            System.out.printf("| %-3.0f | %-14.3f |\n", mil, km);
        }

        System.out.println("-------------------------");
    }
}
