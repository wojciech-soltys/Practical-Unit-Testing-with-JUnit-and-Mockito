package chp03;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

/**
 * Created by Wojciech_Soltys on 28.12.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {

    private static final Object[] getFahrenheitToCelcius() {
        return $(
                $(32, 0),
                $(99, 37),
                $(212, 100)
        );
    }

    @Test
    @Parameters(method = "getFahrenheitToCelcius")
    public void shouldConvertCelciusToFahrenheit(int fahrenheit, int celcius) {
        assertEquals(fahrenheit, FahrenheitCelciusConverter.toFahrenheit(celcius));
    }

    @Test
    @Parameters(method = "getFahrenheitToCelcius")
    public void shouldConvertFahrenheitToCelcius(int fahrenheit, int celcius) {
        assertEquals(celcius, FahrenheitCelciusConverter.toCelcius(fahrenheit));
    }


}
