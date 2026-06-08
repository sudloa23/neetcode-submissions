class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(indexes.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = indexes.get(target - nums[i]);
                return result;
            }else{
                indexes.put(nums[i], i);
            }
        }
        return null;
    }
}
