package tracker;

import java.util.Scanner;

public class Utils {
    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        var ret = scanner.nextLine();
        scanner.close();
        return ret.trim();
    }
}
