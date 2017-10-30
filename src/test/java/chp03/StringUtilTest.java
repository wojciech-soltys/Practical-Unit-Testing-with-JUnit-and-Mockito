package chp03;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

/**
 * Created by Wojciech_Soltys on 28.12.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class StringUtilTest {

    private static final Object[] getString() {
        return $(
                $("a"),
                $("abc"),
                $("kajak"),
                $(""),
                $(StringUtils.leftPad("foobar", 99, '*'))
        );
    }

    @Test
    @Parameters(method = "getString")
    public void reverse(String inputString) throws Exception {
        String reverseString = new StringBuilder(inputString).reverse().toString();
        assertEquals(reverseString, StringUtil.reverse(inputString));
    }

    @Test(expected = NullPointerException.class)
    public void reverseShouldThrowNullPointerException() throws Exception {
        StringUtil.reverse(null);
    }

}