public class Diamond {

    public static void drawDiamond(int height) {
        // Páros érték esetén informatív hibaüzenet
        if (height % 2 == 0) {
            System.out.println("Hiba: A magassagnak paratlan szamnak kell lennie! (Kaptuk: " + height + ")");
            return;
        }

        int n = height / 2;

        // Felső rész és középső sor
        for (int i = 0; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i + 1));
        }

        // Alsó rész
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i + 1));
        }
    }

    public static void main(String[] args) {
        // Ellenőrizzük, hogy adtak-e meg parancssori argumentumot
        if (args.length == 0) {
            System.out.println("Hiba: Kerlek add meg a gyemant magassagat argumentumkant!");
            System.out.println("Hasznalat: java Diamond <magassag>");
            return;
        }

        // Try-catch helyett reguláris kifejezéssel (regex) vizsgáljuk meg a formátumot.
        // A "-?\\d+" jelentése: opcionális mínusz jel, amit egy vagy több számjegy követ.
        if (!args[0].matches("-?\\d+")) {
            System.out.println("Hiba: A megadott argumentum nem egy ervenyes egesz szam!");
            return;
        }

        // Mivel már biztosan számformátumú a string, biztonságosan konvertálhatjuk
        int height = Integer.parseInt(args[0]);
        drawDiamond(height);
    }
}
