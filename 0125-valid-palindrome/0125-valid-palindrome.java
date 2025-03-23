class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                str.append(s.charAt(i));
            }
        }
        String original = str.toString();
        String reversed = str.reverse().toString();
        System.out.println(reversed);
        return original.equals(reversed);
    }
}