class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character, Integer> map1 = new HashMap<>();
        // Map<Character, Integer> map2 = new HashMap<>();

        // for (Character c: s.toCharArray()) {
        //     map1.put(c, map1.getOrDefault(c, 0) + 1);
        // }

        // for (Character c: t.toCharArray()) {
        //     map2.put(c, map2.getOrDefault(c, 0) + 1);
        // }
        // return map1.equals(map2);

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        s.codePoints().forEach(cp -> 
            map1.put(cp, map1.getOrDefault(cp, 0) + 1));

        t.codePoints().forEach(cp -> 
            map2.put(cp, map2.getOrDefault(cp, 0) + 1));

        return map1.equals(map2);
    }
}