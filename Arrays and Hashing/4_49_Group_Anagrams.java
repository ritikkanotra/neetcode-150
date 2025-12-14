class Solution {

    Map<Character, Integer> getCharCountMap(String str) {
        Map<Character, Integer> map = new HashMap();
        for (Character ch: str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<Map<Character, Integer>, List<String>> helperMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> map = getCharCountMap(strs[i]);
            List<String> arr = helperMap.getOrDefault(map, new ArrayList<>());
            arr.add(strs[i]);
            helperMap.put(map, arr);
        }
        return new ArrayList<>(helperMap.values());
    }
}