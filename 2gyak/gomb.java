import java.util.Scanner;

public class gomb {

    static class Sphere {
        private double sugar;

        public Sphere(double sugar) {
            this.sugar = sugar;
        }

        public double felszin() {
            return 4 * Math.PI * this.sugar * this.sugar;
        }

        public double terfogat() {
            return (4.0 / 3.0) * Math.PI * Math.pow(this.sugar, 3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a gömb sugarát: ");
        double r = scanner.nextDouble();

        Sphere sphere = new Sphere(r);

        double a = sphere.felszin();
        double v = sphere.terfogat();

        System.out.println("A gömb felszíne: " + a);
        System.out.println("A gömb térfogata: " + v);

        scanner.close();
    }
}