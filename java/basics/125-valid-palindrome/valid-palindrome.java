class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        String newStr = palindromeStr(s,"",1);
        newStr = newStr.trim();
        newStr = newStr.toLowerCase();
        return newStr.equals(cleanStr(s,"",0));
    }

    private String cleanStr(String s, String str, int c){

        if (c == s.length()){
            return str;
        }
        if (Character.isLetterOrDigit(s.charAt(c))){
            str = str + s.charAt(c);
        }
        c = c + 1;
        return cleanStr(s,str,c);
    }

    private String palindromeStr(String s, String str, int c){
        if (c > s.length()){
            return str;
        }
        if (Character.isLetterOrDigit(s.charAt(s.length()-c))){
            str = str + s.charAt(s.length()-c);
        }
        c = c + 1;
        return palindromeStr(s, str, c);
    }
}
