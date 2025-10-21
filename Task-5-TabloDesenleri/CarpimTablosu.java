public class CarpimTablosu {

    public static void main(String[] args) {

        int carpan = 2; // Çarpım tablosu istenen sayı
        int sinir = 10; // 1'den 10'a kadar

        System.out.println("=================================");
        System.out.println("      " + carpan + "'NİN ÇARPIM TABLOSU     ");
        System.out.println("=================================");

        String rowFormat = "%2d x %-2d = %2d\n";

        for (int i = 1; i <= sinir; i++) {
            int sonuc = carpan * i;

            System.out.printf(rowFormat, carpan, i, sonuc);
        }

        System.out.println("=================================");
    }
}
