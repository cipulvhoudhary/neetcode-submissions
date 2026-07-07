class Solution {
    
    public boolean isPalindromeHelper(String sb) {
        int n = sb.length(), i=0, j=n-1;

        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        return isPalindromeHelper(sb.toString());
    }
}