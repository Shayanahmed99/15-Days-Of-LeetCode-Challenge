class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String s = strs[0];
        for(int i = 1; i<strs.length; i++){
            String prefix = "";
            if(s.equals("")){
                return "";
            }
            int index = Math.min(strs[i].length(), s.length());
            for(int j = 0; j<index; j++){
                if(strs[i].charAt(j) != s.charAt(j) && j < s.length()){
                    break;
                }
                prefix = prefix + strs[i].charAt(j);
            }
            s = prefix;
        }
        return s;
    }
}