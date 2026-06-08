class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> tally = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(tally.containsKey(nums[i])){
                return true;
            }else{
                tally.put(nums[i], true);
            }
        }
        return false;
        
    }
}