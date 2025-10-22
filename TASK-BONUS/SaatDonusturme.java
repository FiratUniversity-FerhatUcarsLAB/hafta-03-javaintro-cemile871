public class SaatDonusturme {

    public static void main(String[] args) {

        // Örnek: 3665 saniye (Lütfen bu değeri değiştirebilirsiniz)
        int toplamSaniye = 3665;

        System.out.println("==========================================");
        System.out.println("          SANIYEDEN SAAT DÖNÜŞTÜRME        ");
        System.out.println("==========================================");
        System.out.println("Toplam Saniye: " + toplamSaniye);

        // 1. Saat Hesaplama: Toplam saniyeyi 3600'e (1 saat) bölme
        int saat = toplamSaniye / 3600;

        // 2. Kalan Saniyeler: Saatleri çıkardıktan sonra kalan saniye
        int kalanSaniye = toplamSaniye % 3600;

        // 3. Dakika Hesaplama: Kalan saniyeyi 60'a (1 dakika) bölme
        int dakika = kalanSaniye / 60;

        // 4. Son Saniye Hesaplama: Dakikaları çıkardıktan sonra kalan saniye
        int saniye = kalanSaniye % 60;

        // Sonucu Saat:Dakika:Saniye formatında yazdırma
        // %02d: İki basamaklı göster, gerekirse başına '0' koy.
        String zamanFormatli = String.format("%02d:%02d:%02d", saat, dakika, saniye);

        System.out.println("------------------------------------------");
        System.out.println("Sonuç: " + toplamSaniye + " saniye = " + zamanFormatli);
        System.out.println("==========================================");
    }
}
