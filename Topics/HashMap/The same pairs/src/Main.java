import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        int cnt = 0;
        for (var m1: map1.entrySet()) {
            for (var m2: map2.entrySet()) {
                if (m1.getKey().equals(m2.getKey()) && m1.getValue().equals(m2.getValue())) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}