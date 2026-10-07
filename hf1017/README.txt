public class CleanString {

    /**
     * Eltávolítja az összes whitespace karaktert (szóköz, újsor, tabulátor stb.) a kapott sztringből.
     *
     * @param input A bemeneti sztring
     * @return A tisztított sztring
     */
    public static String clean(String input) {
        if (input == null) {
            return null;
        }
        // A \\s reguláris kifejezés az összes whitespace karakterre illeszkedik
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String test1 = "192.20.246.138:\n 6666";
        String test2 = "206.130.99.82:\n8080";

        System.out.println(clean(test1)); // Kimenet: 192.20.246.138:6666
        System.out.println(clean(test2)); // Kimenet: 206.130.99.82:8080
    }
}
