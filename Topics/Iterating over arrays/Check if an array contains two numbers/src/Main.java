import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var count = scanner.nextInt();
        int[] numbs = new int[count];
        for (int i = 0; i < count; i++) {
            numbs[i] = scanner.nextInt();
        }
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        for (int i = 0; i < count - 1; i++) {
            if (numbs[i] == two && numbs[i + 1] == one || numbs[i] == one && numbs[i + 1] == two) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}