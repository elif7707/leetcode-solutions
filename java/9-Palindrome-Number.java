class Solution {
    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int len = s.length();
        int j = len - 1;
        int i = 0;

        if(x < 0){
            return false;
        }

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
