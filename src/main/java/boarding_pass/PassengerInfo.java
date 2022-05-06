/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: PassengerInfo - class for passenger input
 */
package boarding_pass;

import java.util.Scanner;

public final class PassengerInfo {
    public static Scanner scanner = new Scanner(System.in);
    public static String firstName;
    public static String lastName;
    public static String email;
    public static String gender;
    public static int age;
    public static String phoneNumber;
    public static String trip;
    public static String departureDateTime = " ";
    public static String departureTime;
    public static String departureDate;

public static void intro(){
    System.out.println("Welcome to the Boarding Pass Ticket Station!\n" +
            "Please fill out the following information. ");
    }
public static String getName(){
    System.out.println("Please enter your first name: ");
    firstName = scanner.next();
    System.out.println("Please enter your last name: ");
    lastName = scanner.next();
    return firstName +" "+ lastName;
}
public static int getAge(){
    System.out.println("Please enter your age: ");
    return age = scanner.nextInt();
}
public static String getEmail(){
    System.out.println("Please enter your email address: ");
    return email = scanner.next();
}
public static String getGender(){
    System.out.println("Are you Male or Female?");
    return gender = scanner.next();
}
public static String getPhoneNumber(){
    System.out.println("Please enter your phone number: ");
    return phoneNumber = scanner.next();
}
public static String getDepartureDateTime(){
    System.out.println("Please enter the Date you will be departing for your trip: ");
    departureDate = scanner.next();
    scanner.nextLine();
    System.out.println("Please enter the Time you will be departing for your trip: ");
    departureTime = scanner.nextLine();
    return departureDateTime = departureDate+" "+departureTime;
    }
public static String getTripCode(){
    System.out.println("Please enter the number for the trip you want to take. Trips are displayed origin-destinations. ");
    System.out.println(
            "   1. DCA_NYA\n" +
            "   2. DCA_LAA\n" +
            "   3. DCA_ORD\n" +
            "   4. DCA_ATL\n" +
            "   5. NYA_ATL\n" +
            "   6. NYA_LAA\n" +
            "   7. NYA_ORD\n" +
            "   8. ATL_LAA\n" +
            "   9. ATL_ORD");
    int tripSelection = scanner.nextInt();
    switch(tripSelection){
        case 1:
            trip = String.valueOf(TripCode.DCA_NYA);
            break;
        case 2:
            trip = String.valueOf(TripCode.DCA_LAA);
            break;
        case 3:
            trip = String.valueOf(TripCode.DCA_ORD);
            break;
        case 4:
            trip = String.valueOf(TripCode.DCA_ATL);
            break;
        case 5:
            trip = String.valueOf(TripCode.NYA_ATL);
            break;
        case 6:
            trip = String.valueOf(TripCode.NYA_LAA);
            break;
        case 7:
            trip = String.valueOf(TripCode.NYA_ORD);
            break;
        case 8:
            trip = String.valueOf(TripCode.ATL_LAA);
            break;
        case 9:
            trip = String.valueOf(TripCode.ATL_ORD);
            break;
        default:
            break;
    }
    return trip;
}
public static void confirmPassengerInfo(){
    System.out.println("Please confirm the following info is correct: \n"+
            "Full Name: "+firstName + " "+ lastName+"\n"+
            "Age: "+age+"\n"+
            "Email Address: "+email + "\n"+
            "Gender: "+gender+"\n"+
            "Phone Number: "+phoneNumber+"\n"+
            "Departure Date/Time: "+ departureDateTime + "\n"+
            "Trip Code: "+ trip);
    System.out.println("Please enter 1 to confirm or 2 for incorrect data");
    int confirmInfo = scanner.nextInt();
    if (confirmInfo == 1){
        System.out.println("Entry confirmed");
    }else{
        System.out.println("Please try inputting your info again.");
        //ToDo Need to redo PassengerInfo entry if user chooses this.
        }
    }
public static boolean continueOrQuit() {
    System.out.println("Do you want to purchase another ticket? (yes or no)");
    String ans = scanner.next();
    return !ans.equals("no");
    }
}
