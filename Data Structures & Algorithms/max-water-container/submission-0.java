class Solution {
    public int maxArea(int[] heights){
        if(heights.length <= 1){
            return 0;
        }

        int i = 0;
        int j = heights.length-1;

        List<Integer> waters = new ArrayList<>();

        while(i < j){
            waters.add((j - i) * Math.min(heights[i], heights[j]));

            if(heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }
        }

        return Collections.max(waters);
    }
}
