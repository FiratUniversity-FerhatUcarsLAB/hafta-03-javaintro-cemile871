public class ÜçgenAlanHesap {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        double cevre = a + b + c;
        double s = cevre / 2;

        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Üçgenin kenarları:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.printf("Yarı çevre (s) = %.4f%n", s);
        System.out.printf("Alan = %.4f%n", alan);
        System.out.printf("Çevre = %.4f%n", cevre);
    }
}
