class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        Set<Integer> lengths = new HashSet<>();
        int count = 0;
        String result = "";
        for(int i = 0; i<s.length(); i++){
            int index = result.indexOf(s.charAt(i));
            if(index != -1){
                count = result.length();
                result = result.substring(index + 1) + s.charAt(i);
                lengths.add(count);
            }
            else{
                result += s.charAt(i);
            }
        }
        lengths.add(result.length());
        return Collections.max(lengths);
    }
}