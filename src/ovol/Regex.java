package ovol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex  {
    public static boolean RegexNumInp(String y) {

       final Pattern pattern1 = Pattern.compile("[0-9]\\d");
        Matcher m1 = pattern1.matcher(y);
        return m1.matches();
    }
    public static boolean RegexOpInp(String z) {
        final Pattern pattern2 = Pattern.compile("\\W[*][/][-][+]");
        Matcher m2 = pattern2.matcher(z);
        return m2.matches();
    }




}
