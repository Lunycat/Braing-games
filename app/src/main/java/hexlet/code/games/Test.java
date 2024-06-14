package hexlet.code.games;

public class Test {
    public static void main(String[] args) {
        System.out.println(gcd(20, 18));
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
