class Solution {
    public boolean isPalindrome(int x) {
        int a= x, reversed=0;
        if (x<0) return false;
        while(a>0){
            reversed= reversed*10+(a%10);
            a/=10;
        }

        return x==reversed;
    }

    public static void main (String args[]){
        int x = 121;
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(x));
        
    }
}