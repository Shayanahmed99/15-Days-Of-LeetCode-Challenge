class Solution {
    public char findTheDifference(String s, String t) {
        char ch = ' ';
        for(int i = 0; i<t.length(); i++){
            ch = t.charAt(i);
            int index = s.indexOf(ch);
            if(index == -1){
                break;
            }
            else{
                s = s.substring(0, index) + s.substring(index+1);
            }
        }
        return ch;
    }
}