class Solution {
    public int trap(int[] height) {
        int[] prefixes = new int[height.length];
        int[] suffixes = new int[height.length];

        prefixes[0] = height[0];
        for(int i = 1; i < height.length; i++){
            prefixes[i] = Math.max(prefixes[i - 1], height[i]);
        }

        suffixes[height.length - 1] = height[height.length -1];
        for(int i = height.length-2; i >= 0; i--){
            suffixes[i] = Math.max(suffixes[i+1], height[i]);
        }

        int water = 0;
        for(int i = 0; i < height.length; i++){
            water += Math.min(prefixes[i], suffixes[i]) -height[i];
        }

        return water;
    }
}
