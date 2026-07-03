class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freqS = new int[26];

        for(int i=0; i<s.length(); i++) {
            int ind = s.charAt(i) - 'a';
            freqS[ind]++;
        }

        for(int i=0; i<t.length(); i++) {
            int ind = Integer.valueOf(t.charAt(i) - 'a');
            freqS[ind]--;
        }

        for(int i=0; i<26; i++) {
            if(freqS[i] != 0) {
                return false;
            }
        }

        return true;
    }

}
