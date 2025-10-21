public class ParaBozma {

    public static void main(String[] args) {
        
        int tutar = 278;

        int[] paralar = {200, 100, 50, 20, 10, 5, 2, 1};

        int kalanTutar = tutar;

        System.out.println("==========================================");
        System.out.println("           PARA BOZMA HESAPLAMA           ");
        System.out.println("==========================================");
        System.out.println("Bozulacak Tutar: " + tutar + " TL");
        System.out.println("------------------------------------------");

        StringBuilder sonuc = new StringBuilder();

        for (int paraDegeri : paralar) {

            int adet = kalanTutar / paraDegeri;

            if (adet > 0) {

                sonuc.append(adet).append("x").append(paraDegeri).append(", ");

                kalanTutar = kalanTutar % paraDegeri;
            }
        }


        if (sonuc.length() > 0) {
            sonuc.setLength(sonuc.length() - 2);
        }

        System.out.println("Bozma İşlemi: " + sonuc.toString());
        System.out.println("==========================================");
    }
}
