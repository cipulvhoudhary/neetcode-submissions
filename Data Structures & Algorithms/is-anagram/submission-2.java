class Solution {

    public boolean isAnagram(String s, String t) {
        int[] cntS = new int[26];
        int[] cntT = new int[26];

        for(int i=0; i<s.length(); i++) {
            int ind = Integer.valueOf(s.charAt(i) - 'a');
            cntS[ind]++;
        }

        for(int i=0; i<t.length(); i++) {
            int ind = Integer.valueOf(t.charAt(i) - 'a');
            cntT[ind]++;
        }

        for(int i=0; i<26; i++) {
            if(cntS[i] != cntT[i]) {
                return false;
            }
        }
        return true;
    }

}
