class Solution {

    public String encode(List<String> strs){
        String encoded = "";
        for(int i = 0; i < strs.size(); i++){
            encoded += strs.get(i).length();
            encoded += ":";
            encoded += strs.get(i);
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> results = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int seperatorIndex = str.indexOf(':', i);
            int length = Integer.parseInt(str.substring(i, seperatorIndex));
            i = seperatorIndex + 1;

            String word = str.substring(i, i + length);
            results.add(word);

            i += length;
        }
        return results;
    }
}
