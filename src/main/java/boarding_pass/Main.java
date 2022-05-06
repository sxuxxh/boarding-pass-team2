/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: Main
 */
package boarding_pass;

import java.util.HashMap;

import static boarding_pass.PassengerInfo.*;

public class Main {
    public static PriceList priceList = new PriceList(new HashMap<TripCode, Double>());


    public static void main(String[] args) {
        priceList.populatePriceLst();

    /*    PassengerInfo.intro();
        PassengerInfo.getName();
        PassengerInfo.getAge();
        PassengerInfo.getEmail();
        PassengerInfo.getGender();
        PassengerInfo.getPhoneNumber();
        PassengerInfo.getDepartureDateTime();
        PassengerInfo.getTripCode();
        PassengerInfo.confirmPassengerInfo();
        PassengerInfo.continueOrQuit();
*/
        CalculateTotalPrice.getTotalPrice(PassengerInfo.getAge(), PassengerInfo.getGender(), TripCode.valueOf(PassengerInfo.getTripCode()));
    }

}
