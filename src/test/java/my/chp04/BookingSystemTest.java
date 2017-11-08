package my.chp04;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Wojciech_Soltys on 29.12.2016.
 */
public class BookingSystemTest {

    private Set<LocalTime> setOfHours;
    private BookingSystem bookingSystem;
    private final LocalTime LT_16_00 = LocalTime.of(16,0);
    private final LocalTime LT_17_00 = LocalTime.of(17,0);
    private final LocalTime LT_18_00 = LocalTime.of(18,0);
    private final LocalTime LT_18_30 = LocalTime.of(18,30);

    @Before
    public void setUp() throws Exception {
        bookingSystem = new BookingSystem();
        setOfHours = new HashSet<>();

        bookingSystem.bookHour(LT_16_00);
        setOfHours.add(LT_16_00);
        bookingSystem.bookHour(LT_17_00);
        setOfHours.add(LT_17_00);
    }

    @Test
    public void shouldReturnListOfBookedHours() throws Exception {
        assertEquals(setOfHours, bookingSystem.getSetOfHours());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowBookHourTwice() throws Exception {
        bookingSystem.bookHour(LT_16_00);
    }

    @Test
    public void bookingShouldAddHourToList() throws Exception {
        bookingSystem.bookHour(LT_18_00);

        assertEquals(3, bookingSystem.getSetOfHours().size());
        assertTrue(bookingSystem.getSetOfHours().contains(LT_18_00));
    }

    @Test(expected = IllegalArgumentException.class)
    public void bookingShouldBeAllowedOnlyForWholeHour() throws Exception {
        bookingSystem.bookHour(LT_18_30);
    }
}
