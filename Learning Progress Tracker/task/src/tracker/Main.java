package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Learning Progress Tracker");
        switch (scanner.nextLine().trim()) {
            case "" -> System.out.println("No input.");
            case "exit" -> System.out.println("Bye!");
            default -> System.out.println("Error: unknown command!");
        }

    }
}
