class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(countMap.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println(entries);
        int[] ans = new int[k];
        for (int i = 0; i < k && i < entries.size(); i++) {
            ans[i] = entries.get(i).getKey();
        } 
        return ans;
    }
}