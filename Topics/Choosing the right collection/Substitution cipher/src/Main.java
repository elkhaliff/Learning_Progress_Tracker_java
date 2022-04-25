import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputArr = scanner.nextLine().toCharArray();
        char[] cipherArr = scanner.nextLine().toCharArray();
        Map<Character, Character> decodeMap = new HashMap<>();
        Map<Character, Character> encodeMap = new HashMap<>();
        for (int i = 0; i < inputArr.length; i++) {
            decodeMap.put(inputArr[i], cipherArr[i]);
            encodeMap.put(cipherArr[i], inputArr[i]);
        }
        scanner.nextLine().chars().forEach(x -> System.out.print(decodeMap.get((char) x)));
        System.out.println();
        scanner.nextLine().chars().forEach(x -> System.out.print(encodeMap.get((char) x)));
    }
}