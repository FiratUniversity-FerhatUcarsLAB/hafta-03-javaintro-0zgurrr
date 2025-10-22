public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5;
        double pi = 3.14159;

        // ALAN HESABI
        double alan = pi * r * r;

        // ÇEVRE HESABI
        double cevre = 2 * pi * r;

        // YARIÇAP
        double yariCap = r; 

        // ÇIKTI, SONUÇ
        System.out.println("Alan = " + alan);
        System.out.println("Çevre = " + cevre);
        System.out.println("Yarıçap = " + yariCap);
    }
}
