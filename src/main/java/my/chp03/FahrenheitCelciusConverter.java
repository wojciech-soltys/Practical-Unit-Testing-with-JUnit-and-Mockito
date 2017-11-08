package my.chp03;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FahrenheitCelciusConverter {

    public static int toCelcius(int fahrenheit) {
        double doubleFahrenheit = fahrenheit;
        return (int) Math.round((doubleFahrenheit - 32.0) * 5.0 / 9.0);
    }

    public static int toFahrenheit(int celcius) {
        double doubleCelcius = celcius;
        return (int) Math.round(doubleCelcius * 9.0 / 5.0 + 32.0);
    }
}
