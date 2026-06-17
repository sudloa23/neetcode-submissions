class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        List<Integer> trio;
        for(int i = 0; i < nums.length - 2; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            trio = new ArrayList<>();
            int j = i+1, k = nums.length-1;
            int target = -nums[i];

            while(j < k){
                if(nums[j] + nums[k] == target){
                    trio = new ArrayList<>();
                    trio.add(nums[i]);
                    trio.add(nums[j]);
                    trio.add(nums[k]);
                    result.add(trio);
                    
                    while(j < k && nums[j] == nums[j+1]){
                        j++;
                    }

                    while(j < k && nums[k] == nums[k-1]){
                        k--;
                    }

                    j++;
                    k--;

                }else if(nums[j] + nums[k] > target){
                    k--;
                }else if(nums[j] + nums[k] < target){
                    j++;
                }
            }
        }

        return result;
    }
}
