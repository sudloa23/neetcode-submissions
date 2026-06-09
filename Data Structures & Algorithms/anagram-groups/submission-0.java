class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Integer[] alphabet = new Integer[26];
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> collection = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            List<String> temp = new ArrayList<>();
            for(int y = 0; y < 26; y++){
            alphabet[y] = 0;
            }

            for(int j = 0; j < strs[i].length(); j++){
                char[] word = strs[i].toCharArray();
                alphabet[word[j] - 'a']++;
            }
            if(collection.containsKey(Arrays.toString(alphabet))){
                collection.get(Arrays.toString(alphabet)).add(strs[i]);
            }else{
                temp.add(strs[i]);
                collection.put(Arrays.toString(alphabet), temp);
            }
        }

        Collection coll = collection.values();
        result = new ArrayList(coll);

        return result;
    }
}
