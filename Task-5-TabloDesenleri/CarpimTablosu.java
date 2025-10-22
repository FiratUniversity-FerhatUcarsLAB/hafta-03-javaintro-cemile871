public class CarpimTablosu {

    public static void main(String[] args) {

        int carpan = 2; // Çarpım tablosu istenen sayı
        int sinir = 10; // 1'den 10'a kadar

        System.out.println("=================================");
        System.out.println("      " + carpan + "'NİN ÇARPIM TABLOSU     ");
        System.out.println("=================================");

        // Satır formatı: "2 x 1 = 2" şeklinde çıktı almak için
        // %d: Tam sayı
        String rowFormat = "%2d x %-2d = %2d\n";

        for (int i = 1; i <= sinir; i++) {
            int sonuc = carpan * i;

            // %2d: Sağa hizalı, 2 karakter genişliğinde tam sayı
            System.out.printf(rowFormat, carpan, i, sonuc);
        }

        System.out.println("=================================");
    }
}
