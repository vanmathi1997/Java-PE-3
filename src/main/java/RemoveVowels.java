import java.util.Arrays;
import java.util.List;

public class RemoveVowels {
    static String remove(String str) {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u'};

        List<Character> arraylist = Arrays.asList(vowels);

        StringBuffer buffer = new StringBuffer(str);

        for (int i = 0; i < buffer.length(); i++) {

            if (arraylist.contains(buffer.charAt(i))) {
                buffer.replace(i, i + 1, "");
                i--;
            }
        }


        return buffer.toString();
    }
}
