class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }
        String modified = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch<= 'Z'){
                modified = modified + Character.toLowerCase(ch);
            }
            else if(ch >= 'a' && ch <= 'z'){
                modified = modified + ch;
            }
            else if(ch >= '0' && ch <= '9'){
                modified = modified + ch;
            }
        }
        String reverse = "";
        for(int i = 0; i<modified.length(); i++){
            reverse = modified.charAt(i) + reverse;
        }
        return modified.equals(reverse);
    }
}