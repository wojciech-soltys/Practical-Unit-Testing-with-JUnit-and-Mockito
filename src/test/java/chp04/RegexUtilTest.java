package chp04;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Wojciech_Soltys on 29.12.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class RegexUtilTest {

    private static final Object[] getStringAndNumbers() {
        return $(
                $("abc 12", new int[]{}),
                $("cdefg 345 12bb23", new int[]{345}),
                $("cdefg 345 12bbb33 678tt", new int[]{345,678})
        );
    }

    @Test
    @Parameters(method = "getStringAndNumbers")
    public void extractNumbersWithThreeOrMoreDigitsFromString(String inputString, int[] expectedNumbers) throws Exception {
        assertArrayEquals(expectedNumbers, RegexUtil.extractNumbersWithThreeOrMoreDigitsFromString(inputString));
    }
}
