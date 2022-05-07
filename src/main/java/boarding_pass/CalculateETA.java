/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: calculate estimated arrival datetime based on departure datetime and predefined ETAList
 */
package boarding_pass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalculateETA {
    // Calculate final ETA
    public static String calculateETA(String departureDateTime, TripCode tripCode) {
        Date date = null;

        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss a", Locale.ENGLISH);
        formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        // Sample String dateInString = "05-04-2022 10:15:55 AM";
        try {
            date = formatter.parse(departureDateTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String formattedDateString = formatter.format(date);
        //System.out.println("Date: "+formattedDateString);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timeInSecs = cal.getTimeInMillis();

        Date dateAfterAddingXMins = new Date((long) (timeInSecs + (getETA(tripCode) * 60 * 60 * 1000)));
        return formatter.format(dateAfterAddingXMins);
    }

    // Get ETA based on tripcode
    public static float getETA(TripCode tripCode) {
        float eta=0;
        for (TripCode key: BoardingPass.etaLst.getEtaLst().keySet()) {
            if (key.equals(tripCode)) {
                eta= BoardingPass.etaLst.getEtaLst().get(key);
            }
        }
        return eta;
    }
}
