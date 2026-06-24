class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int maxLength = 0;
        int maxFreq = 0;
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            char current = s.charAt(r);
            count[current - 'A']++;

            maxFreq = Math.max(maxFreq, count[current - 'A']);

            if((r - l + 1) - maxFreq > k){
                count[s.charAt(l) - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
