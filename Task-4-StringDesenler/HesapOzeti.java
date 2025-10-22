import java.text.DecimalFormat;

public class HesapOzeti {

    public static void main(String[] args) {

        // Fiyatları ve toplamı TL formatında göstermek için formatlayıcı
        DecimalFormat df = new DecimalFormat("0.00 TL");

        // Alışveriş Listesi Verileri
        // Ürün, Miktar, Birim Fiyat
        String[] urunler = {"Ekmek", "Süt (1L)", "Yumurta (Adet)", "Peynir (Kg)"};
        int[] miktarlar = {2, 1, 10, 1};
        double[] birimFiyatlar = {7.50, 25.99, 3.50, 89.90};

        double genelToplam = 0;

        System.out.println("---------------------------------------------");
        System.out.println("              ALIŞVERİŞ HESAP ÖZETİ          ");
        System.out.println("---------------------------------------------");

        // Tablo Başlığı
        // %-20s: Sola hizalı, 20 karakter genişliğinde metin
        // %8s: Sağa hizalı, 8 karakter
        // %10s: Sağa hizalı, 10 karakter
        String headerFormat = "| %-20s | %-8s | %10s |\n";
        String rowFormat    = "| %-20s | %8d | %10s |\n";
        String line = "---------------------------------------------\n";

        System.out.print(line);
        System.out.printf(headerFormat, "Ürün", "Miktar", "Fiyat");
        System.out.print(line);

        // Satırları Döngü ile Yazdırma
        for (int i = 0; i < urunler.length; i++) {
            double araToplam = miktarlar[i] * birimFiyatlar[i];
            genelToplam += araToplam;

            // Fiyatı formatlayıp tabloya yazdırıyoruz
            System.out.printf(rowFormat,
                    urunler[i],
                    miktarlar[i],
                    df.format(birimFiyatlar[i]));
        }

        System.out.print(line);

        // Toplam Satırı
        // %-31s: Sola hizalı, Toplam ve Miktar kolonlarının genişliği
        // %10s: Sağa hizalı, Fiyat kolonunun genişliği
        System.out.printf("| %-31s | %10s |\n", "GENEL TOPLAM TUTAR", df.format(genelToplam));
        System.out.print(line);
    }

