import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        for (String s: scanner.nextLine().toLowerCase().split(" ")) {
            map.merge(s, 1, Integer::sum);
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}