class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> amount = new HashMap<>();

        for(int num : nums){
            amount.merge(num, 1, Integer::sum);
        }

        List<Integer> keyList = new ArrayList<>(amount.keySet());
        keyList.sort((a, b) -> amount.get(b) - amount.get(a));

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = keyList.get(i);
        }

        return result;
    }
}
