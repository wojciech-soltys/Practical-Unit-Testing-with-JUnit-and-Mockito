package chp04;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Wojciech_Soltys on 29.12.2016.
 */
public class BookingSystem {

    private Set<LocalTime> setOfHours = new HashSet<>();

    public Set<LocalTime> getSetOfHours() {
        return setOfHours;
    }

    public void bookHour(LocalTime localTime) {
        if (setOfHours.contains(localTime)) {
            throw new IllegalArgumentException("Booking is not allowed for: " + localTime);
        }
        if(localTime.getMinute() != 0) {
            throw new IllegalArgumentException("Booking is allowed only for whole hour.");
        }
        setOfHours.add(localTime);
    }
}
