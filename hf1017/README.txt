public class Hamming {

    public static int distance(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("A sztringek nem lehetnek null értékűek!");
        }

        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("A két sztring hossza nem egyezik meg!");
        }

        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }

        return diffCount;
    }

    public static void main(String[] args) {
        String s1 = "toned";
        String s2 = "roses";

        try {
            int d = Hamming.distance(s1, s2);
            System.out.println("Hamming-távolság: " + d);
        } catch (IllegalArgumentException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
    }
}
