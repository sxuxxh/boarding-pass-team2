/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: Main
 */
package boarding_pass;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.HashMap;


public class BoardingPass {
    public static final Path allBoardingPassFilePath = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\allBoardingPass.txt");
    public static final Path oneBoardingPassFilePath = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\oneBoardingPass.txt");
    public static PriceList priceList = new PriceList(new HashMap<TripCode, Double>());
    public static ETAList etaLst = new ETAList(new HashMap<TripCode, Float>());
    private static String boardingPass;
    private static int boardPassNum;

    public static void main(String[] args) {
        priceList.populatePriceLst(); // Populate Price Lst
        etaLst.populateETALst(); // Populate ETA Lst
        BoardingPassStore.createFile(allBoardingPassFilePath); // Create boarding pass storage file
        BoardingPassStore.createFile(oneBoardingPassFilePath); // Create storage file for a boarding pass in presentation format
        PassengerInfo.intro();
        do {
            do {
                getAllForABoardingPass();
            } while (!PassengerInfo.confirmPassengerInfo());
            // Write to storage file
            BoardingPassStore.writeABoardingPass(allBoardingPassFilePath, boardingPass);
            // Save and Print the boarding pass
            BoardingPassStore.writePresentFile(oneBoardingPassFilePath,BoardingPassStore.presentABoardingPass(BoardingPassStore.readABoardingPass(allBoardingPassFilePath,boardPassNum)));
            System.out.println("Here is the boarding pass you purchased (also saved to file storage): ");
            System.out.println(BoardingPassStore.presentABoardingPass(BoardingPassStore.readABoardingPass(allBoardingPassFilePath,boardPassNum)));
        } while (PassengerInfo.continueOrQuit());
        System.out.println("Thank you! We wish you a wonderful and safe trip! Goodbye!");
    }

    // Method: looping input
    public static void getAllForABoardingPass() {
        boardingPass = "";
        boardPassNum = 0;
        int age = 0;
        String gender = "";
        TripCode tripCode = null;
        String departureDateTime = "";
        // Generate unique boarding pass number
        boardPassNum = BoardingPassStore.createBoardingPassNum(allBoardingPassFilePath);
        boardingPass = boardingPass + String.valueOf(boardPassNum) + ",";
        // Get passenger name
        boardingPass = boardingPass + PassengerInfo.getName() + ",";
        // Get passenger age
        age = PassengerInfo.getAge();
        boardingPass = boardingPass + String.valueOf(age) + ",";
        // Get passenger email
        boardingPass = boardingPass + PassengerInfo.getEmail() + ",";
        // Get passenger gender
        gender = PassengerInfo.getGender();
        boardingPass = boardingPass + gender + ",";
        // Get passenger phone number
        boardingPass = boardingPass + PassengerInfo.getPhoneNumber() + ",";
        // Get passenger tripcode
        tripCode = TripCode.valueOf(PassengerInfo.getTripCode());
        boardingPass = boardingPass + tripCode.toString() + ",";
        // Get passenger departure datetime
        departureDateTime = PassengerInfo.getDepartureDateTime();
        boardingPass = boardingPass + departureDateTime + ",";
        // Generate ETA
        boardingPass = boardingPass + CalculateETA.calculateETA(departureDateTime,tripCode) + ",";
        // Generate total price
        boardingPass = boardingPass + String.valueOf(NumberFormat.getCurrencyInstance().format(CalculateTotalPrice.getTotalPrice(age, gender, tripCode)));
    }
}
