class Solution {
public:
    int lengthOfLastWord(string s) {

        int countTheWords = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s[i] != ' '){
                countTheWords++;
            }else{
                if (countTheWords > 0) {
                    break;
                }
            }
            
        }
        return countTheWords;     
    }
};
