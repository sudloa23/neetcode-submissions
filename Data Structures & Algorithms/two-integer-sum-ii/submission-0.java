class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length -1;
        while(true){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] == target){
                int[] result = {i+1, j+1};
                return result;
            }
        }
    }
}
