/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: Main
 */
package boarding_pass;

import static boarding_pass.PassengerInfo.*;

public class Main {
    public static void main(String[] args) {
        PassengerInfo.intro();
        PassengerInfo.getName();
        PassengerInfo.getAge();
        PassengerInfo.getEmail();
        PassengerInfo.getGender();
        PassengerInfo.getPhoneNumber();
        PassengerInfo.getDepartureDateTime();
        PassengerInfo.getTripCode();
        PassengerInfo.confirmPassengerInfo();

        CalculateTotalPrice.getTotalPrice();
    }

}
