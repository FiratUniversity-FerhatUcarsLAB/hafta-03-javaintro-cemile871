public class SaatDonusturme {

    public static void main(String[] args) {

        int toplamSaniye = 3665;

        System.out.println("==========================================");
        System.out.println("          SANIYEDEN SAAT DÖNÜŞTÜRME        ");
        System.out.println("==========================================");
        System.out.println("Toplam Saniye: " + toplamSaniye);

        int saat = toplamSaniye / 3600;

        int kalanSaniye = toplamSaniye % 3600;

        int dakika = kalanSaniye / 60;

        int saniye = kalanSaniye % 60;

        String zamanFormatli = String.format("%02d:%02d:%02d", saat, dakika, saniye);

        System.out.println("------------------------------------------");
        System.out.println("Sonuç: " + toplamSaniye + " saniye = " + zamanFormatli);
        System.out.println("==========================================");
    }
}
