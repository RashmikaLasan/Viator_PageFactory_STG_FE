package Steps;

import java.time.LocalDate;

public class TimeDate {

    public static String timeer(int FutureDateCount){


        LocalDate futureDate = LocalDate.now().plusDays(Long.parseLong(String.valueOf(FutureDateCount)));
        System.out.println("Booking Date is : " + futureDate);
        String StartDate = futureDate.toString();


        return StartDate;
    }

}
