class Solution {
public:
    bool isPalindrome(int x) {

        string s = to_string(x);
        int first = 0;
        int last = s.length() - 1;

        if(x < 0){
            return false;
        }

            while(first < last){
                if(s[first] != s[last]){
                return false;
               }
               
            first++;
            last--;
         }
          
           return true; 
    }
};
