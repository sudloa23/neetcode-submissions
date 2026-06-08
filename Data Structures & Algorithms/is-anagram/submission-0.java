class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String s1 = new String(sChars);
        String t1 = new String(tChars);

        if(s1.equals(t1)){
            return true;
        }else{
            return false;
        }
    }
}