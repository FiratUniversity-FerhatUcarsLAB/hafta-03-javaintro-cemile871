public class ParaBozma {

    public static void main(String[] args) {

        // Bozulacak toplam miktar (Örnek: 278 TL)
        int tutar = 278;

        // Kullanılabilecek Türk Lirası Banknot/Madeni Para değerleri
        int[] paralar = {200, 100, 50, 20, 10, 5, 2, 1};

        int kalanTutar = tutar;

        System.out.println("==========================================");
        System.out.println("           PARA BOZMA HESAPLAMA           ");
        System.out.println("==========================================");
        System.out.println("Bozulacak Tutar: " + tutar + " TL");
        System.out.println("------------------------------------------");

        // Sonucu tutacak bir StringBuilder (daha verimli metin birleştirme)
        StringBuilder sonuc = new StringBuilder();

        for (int paraDegeri : paralar) {
            // Kaç adet bu değerde para kullanılabileceği
            int adet = kalanTutar / paraDegeri;

            if (adet > 0) {
                // Sonuç stringine ekle: "adet x paraDegeri"
                sonuc.append(adet).append("x").append(paraDegeri).append(", ");

                // Kalan tutarı güncelle
                kalanTutar = kalanTutar % paraDegeri;
            }
        }

        // Sonucun sonundaki fazladan ", " kısmını silme
        if (sonuc.length() > 0) {
            sonuc.setLength(sonuc.length() - 2);
        }

        System.out.println("Bozma İşlemi: " + sonuc.toString());
        System.out.println("==========================================");
    }
}

