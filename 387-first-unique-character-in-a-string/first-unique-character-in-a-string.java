class Solution {
    public int firstUniqChar(String s) {
        Set<Character> chars = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            Boolean unique = true;
            for(int j = i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    unique = false;
                    chars.add(s.charAt(i));
                    break;
                }
            }
            if(unique && (!chars.contains(s.charAt(i)))){
                return i;
            }
        }
        return -1;
    }
}