class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse = 0;
        int num = x;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        if(num == reverse){
            return true;
        }
        return false;
    }
}