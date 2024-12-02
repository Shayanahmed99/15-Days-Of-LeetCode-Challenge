class Solution {
    public int romanToInt(String s) {
        List<Character> chars = new ArrayList<>();
        int number = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            switch (ch) {
                case 'I': number += 1; break;
                case 'V':
                    if (!chars.isEmpty() && chars.get(chars.size() - 1) == 'I') {
                        number += 3;
                    } 
                    else {
                        number += 5;
                    }
                    break;
                case 'X':
                    if (!chars.isEmpty() && chars.get(chars.size() - 1) == 'I') {
                        number += 8;
                    } 
                    else {
                        number += 10;
                    }
                    break;
                case 'L':
                    if (!chars.isEmpty() && chars.get(chars.size() - 1) == 'X') {
                        number += 30;
                    } 
                    else {
                        number += 50;
                    }
                    break;
                case 'C':
                    if (!chars.isEmpty() && chars.get(chars.size() - 1) == 'X') {
                        number += 80;
                    } 
                    else {
                        number += 100;
                    }
                    break;
                case 'D':
                    if (!chars.isEmpty() && chars.get(chars.size() - 1) == 'C') {
                        number += 300;
                    } 
                    else {
                        number += 500;
                    }
                    break;
                case 'M':
                    if (!chars.isEmpty() && chars.get(chars.size() - 1) == 'C') {
                        number += 800;
                    } 
                    else {
                        number += 1000;
                    }
                    break;
                default: break;
            }
            
            chars.add(ch);
        }
        
        return number;
    }
}