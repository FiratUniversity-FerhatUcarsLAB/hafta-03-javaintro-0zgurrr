public class HesapOzeti {
    public static void main(String[] args) {
        // Başlık
        System.out.println("-------------------------------");
        System.out.printf("| %-12s | %-6s | %-6s |\n", "Ürün", "Miktar", "Fiyat");
        System.out.println("-------------------------------");

        // Ürünler
        System.out.printf("| %-12s | %6d | %6s |\n", "Erik", 3, "15TL");
        System.out.printf("| %-12s | %6d | %6s |\n", "Ananas", 2, "25TL");
        System.out.printf("| %-12s | %6d | %6s |\n", "Kola", 1, "20TL");

        System.out.println("-------------------------------");

        // Toplam
        System.out.printf("| %-12s | %-6s | %6s |\n", "Toplam", "", "60");
        System.out.println("-------------------------------");
    }
}
