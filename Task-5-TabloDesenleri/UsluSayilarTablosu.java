public class UsluSayilarTablosu {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("        ÜSLÜ SAYILAR TABLOSU       ");
        System.out.println("===================================");
        
        String headerFormat = "| %-5s | %-5s | %-5s |\n";
        String line = "-----------------------------------\n";

        System.out.print(line);
        System.out.printf(headerFormat, "a", "a^2", "a^3");
        System.out.print(line);
        
        String rowFormat = "| %-5d | %-5d | %-5d |\n";

        for (int a = 1; a <= 5; a++) {
            int aKare = a * a;
            int aKup = (int) Math.pow(a, 3);

            System.out.printf(rowFormat, a, aKare, aKup);
        }

        System.out.print(line);
    }
}
