public class negyzet {

    
    static long sumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    
    static long squareOfSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static void main(String[] args) {
        int n = 100;
        
        long sumSq = sumOfSquares(n);
        long sqSum = squareOfSum(n);
        long diff = sqSum - sumSq;

        System.out.println("Összeg négyzete: " + sqSum);
        System.out.println("Négyzetösszeg:   " + sumSq);
        System.out.println("Különbség:       " + diff);
    }
}