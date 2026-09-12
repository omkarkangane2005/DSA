import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count characters of s1
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int low = 0;
        int high = 0;
        int windowSize = s1.length();

        while (high < s2.length()) {

            // Add character to window
            char ch = s2.charAt(high);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            // Keep window size equal to s1 length
            if (high - low + 1 > windowSize) {
                char left = s2.charAt(low);

                map2.put(left, map2.get(left) - 1);

                if (map2.get(left) == 0) {
                    map2.remove(left);
                }

                low++;
            }

            // Compare frequencies
            if (map1.equals(map2)) {
                return true;
            }

            high++;
        }

        return false;
    }
}