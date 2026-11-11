# prog2
Programozási nyelvek 2 Házi feladatok


public class Diamond {

    public static void drawDiamond(int height) {
        // Ellenőrizzük, hogy a magasság páros-e
        if (height % 2 == 0) {
            System.out.println("Hiba: A magasság csak páratlan szám lehet!");
            return;
        }

        int n = height / 2; // A középső sor indexe (pl. 7 esetén 3)

        // Felső rész és a középső, leghosszabb sor
        for (int i = 0; i <= n; i++) {
            int spaces = n - i;
            int stars = 2 * i + 1;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }

        // Alsó rész
        for (int i = n - 1; i >= 0; i--) {
            int spaces = n - i;
            int stars = 2 * i + 1;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
    }

    public static void main(String[] args) {
        System.out.println("Magasság: 3");
        drawDiamond(3);
        
        System.out.println("\nMagasság: 7");
        drawDiamond(7);
        
        System.out.println("\nMagasság: 4");
        drawDiamond(4);
    }
}
