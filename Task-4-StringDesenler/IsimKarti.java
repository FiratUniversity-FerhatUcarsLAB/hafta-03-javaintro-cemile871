public class IsimKarti {

    public static void main(String[] args) {
        String ad = "Cemile";
        String soyad = "Akay";
        String ogrenciNo = "250541099";
        String bolum = "Yazılım Muhendisligi";

        System.out.println("=========================================");
        System.out.println("             ÖĞRENCİ KİMLİK KARTI        ");
        System.out.println("=========================================");

        System.out.printf("| %-15s : %-20s |\n", "Ad Soyad", ad + " " + soyad);
        System.out.printf("| %-15s : %-20s |\n", "Öğrenci No", ogrenciNo);
        System.out.printf("| %-15s : %-20s |\n", "Bölüm", bolum);

        System.out.println("=========================================");
    }
}
