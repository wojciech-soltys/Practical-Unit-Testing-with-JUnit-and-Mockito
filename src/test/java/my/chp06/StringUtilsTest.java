package my.chp06;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {

    private static final Object[] getStringAndReverseString() {
        return $(
                $("Wojtek", "ketjoW"),
                $("kajak", "kajak"),
                $("kajaK", "Kajak")
        );
    }

    @Test
    @Parameters(method = "getStringAndReverseString")
    public void reverseShouldReverseString(String inputString, String reversedString) throws Exception {
        assertEquals(reversedString, StringUtils.reverse(inputString));
    }
}
