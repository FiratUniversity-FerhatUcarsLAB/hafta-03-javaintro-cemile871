import java.text.DecimalFormat;

public class HesapOzeti {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00 TL");

        String[] urunler = {"Ekmek", "Süt (1L)", "Yumurta (Adet)", "Peynir (Kg)"};
        int[] miktarlar = {2, 1, 10, 1};
        double[] birimFiyatlar = {7.50, 25.99, 3.50, 89.90};

        double genelToplam = 0;

        System.out.println("---------------------------------------------");
        System.out.println("              ALIŞVERİŞ HESAP ÖZETİ          ");
        System.out.println("---------------------------------------------");

        String headerFormat = "| %-20s | %-8s | %10s |\n";
        String rowFormat    = "| %-20s | %8d | %10s |\n";
        String line = "---------------------------------------------\n";

        System.out.print(line);
        System.out.printf(headerFormat, "Ürün", "Miktar", "Fiyat");
        System.out.print(line);

        for (int i = 0; i < urunler.length; i++) {
            double araToplam = miktarlar[i] * birimFiyatlar[i];
            genelToplam += araToplam;

            System.out.printf(rowFormat,
                    urunler[i],
                    miktarlar[i],
                    df.format(birimFiyatlar[i]));
        }
        System.out.print(line);

        System.out.printf("| %-31s | %10s |\n", "GENEL TOPLAM TUTAR", df.format(genelToplam));
        System.out.print(line);
    }
}
