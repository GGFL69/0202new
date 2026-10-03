package T4;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
