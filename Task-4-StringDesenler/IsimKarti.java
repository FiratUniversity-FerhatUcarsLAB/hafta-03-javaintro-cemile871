public class IsimKarti {

    public static void main(String[] args) {
        // Kendi Bilgilerinizi Buraya Girin
        String ad = "Cemile";
        String soyad = "Akay";
        String ogrenciNo = "250541099";
        String bolum = "Yazılım Muhendisligi";

        // Güzelleştirilmiş formatta ekrana yazdırma
        System.out.println("=========================================");
        System.out.println("             ÖĞRENCİ KİMLİK KARTI        ");
        System.out.println("=========================================");

        // printf ile formatlı çıktı: %-15s sola hizalı 15 karakter
        System.out.printf("| %-15s : %-20s |\n", "Ad Soyad", ad + " " + soyad);
        System.out.printf("| %-15s : %-20s |\n", "Öğrenci No", ogrenciNo);
        System.out.printf("| %-15s : %-20s |\n", "Bölüm", bolum);

        System.out.println("=========================================");
    }
}
