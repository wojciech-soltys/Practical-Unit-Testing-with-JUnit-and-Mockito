package my.chp04;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Wojciech_Soltys on 29.12.2016.
 */
public class RegexUtil {

    private static final String REGEX = "\\d{3,}";
    public static final Pattern PATTERN = Pattern.compile(REGEX);

    public static int[] extractNumbersWithThreeOrMoreDigitsFromString(String inputString) {
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        Matcher matcher = PATTERN.matcher(inputString);
        while (matcher.find()) {
                numbersArrayList.add(NumberUtils.createInteger(matcher.group(0)));
        }
        return numbersArrayList.stream().mapToInt(i -> i).toArray();
    }
}
