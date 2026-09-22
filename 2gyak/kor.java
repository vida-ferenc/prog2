import java.util.Scanner;

public class kor {

    static class Circle {
        private double sugar;

        public Circle(double sugar) {
            this.sugar = sugar;
        }

        public double kerulet() {
            return 2 * this.sugar * Math.PI;
        }

        public double terulet() {
            return this.sugar * this.sugar * Math.PI;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a kör sugarát: ");
        double r = scanner.nextDouble();

        Circle circle = new Circle(r);

        double k = circle.kerulet();
        double t = circle.terulet();

        System.out.println("A kör kerülete: " + k);
        System.out.println("A kör területe: " + t);

        scanner.close();
    }
}