import java.text.DecimalFormat;

public class MilKilometreTablosu {

    public static void main(String[] args) {

        final double MIL_TO_KM_ORANI = 1.609;

        int[] milDegerleri = {1, 5, 10, 20, 50};

        DecimalFormat df = new DecimalFormat("0.000"); // 3 ondalık basamak

        System.out.println("=================================");
        System.out.println("       MİL - KİLOMETRE TABLOSU     ");
        System.out.println("=================================");

        String headerFormat = "| %-10s | %-15s |\n";
        String line = "---------------------------------\n";

        System.out.print(line);

        System.out.printf(headerFormat, "Mil", "Kilometre");
        System.out.print(line);

        String rowFormat = "| %-10d | %-15s |\n";

        for (int mil : milDegerleri) {
            double kilometre = mil * MIL_TO_KM_ORANI;

            System.out.printf(rowFormat, mil, df.format(kilometre));
        }

        System.out.print(line);
    }
}
