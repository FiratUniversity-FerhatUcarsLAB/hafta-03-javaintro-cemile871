import java.text.DecimalFormat;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        double kilo = 80.0;    // Kilogram cinsinden ağırlık
        double boy = 1.75;     // Metre cinsinden boy (Örn: 1.75)

        System.out.println("==========================================");
        System.out.println("      VÜCUT KİTLE İNDEKSİ (BMI) HESAPLAMA  ");
        System.out.println("==========================================");

        double bmi = kilo / (boy * boy);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " m");
        System.out.println("------------------------------------------");
        System.out.println("Vücut Kitle İndeksiniz (BMI): " + df.format(bmi));
        System.out.println("==========================================");

        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Durum: Normal Kilolu");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Durum: Fazla Kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
    }
}
