class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(s.charAt(i), map.get(c)+1);
        }

        for(int i=0; i<n; i++) {
            char c = t.charAt(i);
            if(!map.containsKey(c)) {
                return false;
            } 
            int count = map.get(c);
            count--;
            if(count == 0) {
                map.remove(c);
            } else {
                map.put(c, count);
            }
        }

        return true;
    }
}
