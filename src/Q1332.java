public class Q1332 {
    public int removePalindromeSub(String s) {
        //if it's whole string is palindrome return 1, else 2;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) continue;
            else return 2;
        }
        return 1;
    }
}
