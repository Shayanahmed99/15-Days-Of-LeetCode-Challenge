class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String result = "";
        String word = "" + s.charAt(0);

        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                result = s.charAt(i) + word + result;
                word = "";
                while(s.charAt(i+1) == ' '){
                    i++;
                }
            }
            else{
                word = word + s.charAt(i);
            }
        }
        result = word + result;
        return result;
    }
}