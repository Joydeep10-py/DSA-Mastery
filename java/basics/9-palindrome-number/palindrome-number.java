class Solution {
    public boolean isPalindrome(int x){
        if (x<0) return false;
        int rev =  reverse(x,0);
        return rev == x;
    }
    private int reverse(int n, int rev){
        if (n==0){
            return rev;
        }
        int r = n % 10;
        n = n / 10;
        rev = (rev*10) + r;
        return reverse(n, rev);
    }
}
