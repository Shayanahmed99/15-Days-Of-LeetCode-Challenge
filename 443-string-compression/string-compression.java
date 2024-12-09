class Solution {
    public int compress(char[] chars) {
        String s = "";
        for(int i = 0; i<chars.length; i++){
            int length = 1;
            for(int j = i+1; j<chars.length; j++){
                if(chars[i] != chars[j]){
                    break;
                }
                else{
                    length++;
                }
            }
            s = s + chars[i];
            if(length != 1){
                String l = "";
                l = l + length;
                for(int k = 0; k<l.length(); k++){
                    s = s + l.charAt(k);
                }
                i = i + (length - 1);
            }
        }
        for(int i = 0; i<s.length(); i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}