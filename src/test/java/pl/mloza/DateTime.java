package pl.mloza;

import org.junit.Test;

import java.time.*;

public class DateTime {
    final Clock clock = Clock.systemUTC();

    @Test
    public void testDateTimeSimple() throws Exception {
        System.out.println(clock.instant());
        System.out.println(clock.millis());
    }

    @Test
    public void testLocalDateTime() throws Exception {
        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now(clock);

        System.out.println(date);
        System.out.println(dateFromClock);

        final LocalTime time = LocalTime.now();
        final LocalTime timeFromClock = LocalTime.now(clock);

        System.out.println(time);
        System.out.println(timeFromClock);

        final LocalDateTime datetime = LocalDateTime.now();
        final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);

        System.out.println(datetime);
        System.out.println(datetimeFromClock);
    }

    @Test
    public void testTimeZones() throws Exception {
        final ZonedDateTime zonedDatetime = ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));

        System.out.println(zonedDatetime);
        System.out.println(zonedDatetimeFromClock);
        System.out.println(zonedDatetimeFromZone);
    }

    @Test
    public void testDurationBetweenTwoDates() throws Exception {
        final LocalDateTime from = LocalDateTime.of( 2014, Month.APRIL, 16, 0, 0, 0 );
        final LocalDateTime to = LocalDateTime.of( 2015, Month.APRIL, 16, 23, 59, 59 );

        final Duration duration = Duration.between( from, to );
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );
    }
}
