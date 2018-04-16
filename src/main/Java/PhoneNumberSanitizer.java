import java.util.ArrayList;
import java.util.List;

class PhoneNumberSanitizer {
    public String solution(String S) {
        // write your code in Java SE 8
        String pureString = S.replaceAll("[^0-9]", "");

        int i = 0;
        List<String> l = new ArrayList<>();
        while(i < pureString.length() - 3) {
            l.add(pureString.substring(i, i + 3));
            i = i + 3;
        }

        if(pureString.length() - i == 1) {
            l.remove(l.size() - 1);
            l.add(pureString.substring(i - 3, i - 1));
            l.add(pureString.substring(i - 1, i + 1));
        }
        else
            l.add(pureString.substring(i, pureString.length()));
        return join(l, "-");
    }

    private String join(List<String> groups, String separator) {
        StringBuilder sb = new StringBuilder();
        for (String segment : groups) {
            if (sb.length() > 0) sb.append(separator);
            sb.append(segment);
        }
        return sb.toString();
    }
}