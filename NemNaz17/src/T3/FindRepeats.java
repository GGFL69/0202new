package T3;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder sb = new StringBuilder(text);
        int index;
        while ((index = sb.indexOf(substring)) != -1) {
            count++;
            sb.delete(0, index + substring.length());
        }
        return count;
    }
}
