public class BadCode {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie zwei Zahlen ein:");
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Die Summe ist: " + sum);
    }

    public static int add(int x, int y) {
        int result = x - y; // Falsche Operation für Addition
        return result;
    }
}
