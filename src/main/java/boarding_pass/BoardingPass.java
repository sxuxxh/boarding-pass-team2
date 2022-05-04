/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: BoardingPass - core class to hold boarding pass info
 */
package boarding_pass;

public final class BoardingPass {
    // Fields
    private PassengerInfo passengerInfo;
    private String ETA;
    private double totalTicketPrice;
    private int boardingPassNumber;
    private String tripCode;
    private String departureDateTime;

    // Constructor
    public BoardingPass() {
    }

    public BoardingPass(PassengerInfo passengerInfo, String ETA, double totalTicketPrice, int boardingPassNumber, String tripCode, String departureDateTime) {
        this.passengerInfo = passengerInfo;
        this.ETA = ETA;
        this.totalTicketPrice = totalTicketPrice;
        this.boardingPassNumber = boardingPassNumber;
        this.tripCode = tripCode;
        this.departureDateTime = departureDateTime;
    }

    // Getters
    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public String getETA() {
        return ETA;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public int getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public String getTripCode() {
        return tripCode;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    // No Setters for static class

    //ToString
    @Override
    public String toString() {
        return "BoardingPass{" +
                "passengerInfo=" + passengerInfo +
                ", ETA='" + ETA + '\'' +
                ", totalTicketPrice=" + totalTicketPrice +
                ", boardingPassNumber=" + boardingPassNumber +
                ", tripCode='" + tripCode + '\'' +
                ", departureDateTime='" + departureDateTime + '\'' +
                '}';
    }

    // Methods: generateBoardingPassNum()
    // ToDO: find last boarding number
    public int generateBoardingPassNum(int lastBoardingPassNumber) {
        return lastBoardingPassNumber++;
    }

    // Method: generateETA()
    public String generateETA(TripCode tripCode, String departureDateTime) {
        String eta="";
        // logics to calculate ETA based on departureTime and ETA tripcode mapping
        // ...
        return eta;
    }
}
