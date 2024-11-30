class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while(s.charAt(i) == ' '){
            i--;
        }
        int length = 0;
        for(int j = i; j>=0; j--){
            if(s.charAt(j) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}