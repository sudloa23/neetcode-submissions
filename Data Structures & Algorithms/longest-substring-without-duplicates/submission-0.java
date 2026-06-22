class Solution {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int result = 0;

        for(int r = 0; r < s.length(); r++){
            char currChar = s.charAt(r);

            while(set.contains(currChar)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(currChar);

            result = Math.max(result, r-l + 1);
        }

        return result;
    }
}
