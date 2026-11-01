class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!sMap.containsKey(c)) {
                sMap.put(c, 0);
            } else {
                sMap.replace(c, sMap.get(c) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (!tMap.containsKey(c)) {
                tMap.put(c, 0);
            } else {
                tMap.replace(c, tMap.get(c) + 1);
            }
        }
        return sMap.equals(tMap);
    }
}
