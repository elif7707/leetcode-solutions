class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumbers = new HashMap<Character, Integer>();

        int len = s.length();
        int total = 0;

        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        for(int i = 0; i < len; i++){
            int current = romanNumbers.get(s.charAt(i));

            if(i + 1 < len && current < romanNumbers.get(s.charAt(i + 1))){
                    total -= current;
            }else{
                total += current;
            }
        }
        return total;
    }
}
