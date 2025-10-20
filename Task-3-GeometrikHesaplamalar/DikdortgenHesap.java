public class DikdortgenHesap {
    public static void main(String[] args) {
        double en = 4.5;
        double boy = 7.9;

        double alan = en * boy;
        double cevre = 2 * (en + boy);

        System.out.println("En: " + en);
        System.out.println("Boy: " + boy);
        System.out.printf("Alan = %.4f%n", alan);
        System.out.printf("Çevre = %.4f%n", cevre);
    }
}
