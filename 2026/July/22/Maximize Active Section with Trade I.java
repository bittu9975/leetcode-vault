class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();

        
        int ones = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                ones++;
            }
        }

        
        String t = "1" + s + "1";
        int m = t.length();

        int answer = ones;

        int i = 0;
        while (i < m) {
            if (t.charAt(i) == '1') {
                int start = i;

                
                while (i < m && t.charAt(i) == '1') {
                    i++;
                }

                int end = i - 1;

                
                if (start > 0 && i < m &&
                        t.charAt(start - 1) == '0' &&
                        t.charAt(i) == '0') {

                    
                    int leftZeros = 0;
                    int j = start - 1;
                    while (j >= 0 && t.charAt(j) == '0') {
                        leftZeros++;
                        j--;
                    }

                    
                    int rightZeros = 0;
                    j = i;
                    while (j < m && t.charAt(j) == '0') {
                        rightZeros++;
                        j++;
                    }

                    int oneBlockSize = end - start + 1;

                    
                    answer = Math.max(answer,
                            ones + leftZeros + rightZeros);
                }

            } else {
                i++;
            }
        }

        return answer;
    }
}