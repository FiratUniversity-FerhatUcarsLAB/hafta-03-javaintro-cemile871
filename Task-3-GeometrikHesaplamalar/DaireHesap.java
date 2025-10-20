public class DaireHesap {
    public static void main(String[] args) {
        double yaricap = 5.5;

        double alan = Math.PI * yaricap * yaricap;
        double cevre = 2 * Math.PI * yaricap;

        System.out.println("Yarıçap: " + yaricap);
        System.out.printf("Alan = %.4f%n", alan);
        System.out.printf("Çevre = %.4f%n", cevre);
    }
}
