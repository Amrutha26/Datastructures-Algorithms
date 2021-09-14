class Solution {
    public char findTheDifference(String s, String t) {
        int k = 0;
        int j = 0;
        for (int i = 0; i<s.length(); i++){
            k+=s.charAt(i);
            j+=t.charAt(i);
        }
        j+=t.charAt(s.length());
        return (char) (j-k);
    }
}
