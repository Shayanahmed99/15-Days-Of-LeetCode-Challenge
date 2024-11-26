class Solution {
    public String reverseStr(String s, int k) {
        String result = "";
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            result = result + s.charAt(i);
            if(count == k-1){
                result = result.substring(0,result.length()-k) + reverse(result.substring(result.length()-k));
            }
            if(count == 2*k-1){
                count = -1;
            }
            count++;
        }
        if (count > 0 && count <k) {
            int index = result.length() - count;
            result = result.substring(0, index) + reverse(result.substring(index));
        }
        return result;
    }
    public String reverse(String s){
        String reverseStr = "";
        for(int i = 0; i<s.length(); i++){
            reverseStr = s.charAt(i) + reverseStr;
        }
        return reverseStr;
    }
}