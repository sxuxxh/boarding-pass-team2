/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: PassengerInfo - class for passenger input
 */
package boarding_pass;

import java.util.Scanner;

public final class PassengerInfo {
    Scanner scanner = new Scanner(System.in);
    String firstName;
    String lastName;
    String email;
    String gender;
    int age;
    String phoneNumber;
    String trip;
    String departureDateTime;

    public void main(String[] args) {
        intro();
        getName();
        getAge();
        getEmail();
        getGender();
        getPhoneNumber();
        getDepartureDateTime();
        getTripCode();
        confirmPassengerInfo();
    }

public static String intro(){
     return "Welcome to the Boarding Pass Ticket Station!\n" +
             "Please fill out the following information. ";
    }
public String getName(){
    System.out.println("Please enter your first name: ");
    firstName = scanner.next();
    System.out.println("Please enter your last name: ");
    lastName = scanner.next();
    return firstName +" "+ lastName;
}
public int getAge(){
    System.out.println("Please enter your age: ");
    return age = scanner.nextInt();
}
public String getEmail(){
    System.out.println("Please enter your email address: ");
    return email = scanner.next();
}
public String getGender(){
    System.out.println("Please enter your gender: ");
    return gender = scanner.next();
}
public String getPhoneNumber(){
    System.out.println("Please enter your phone number: ");
    return phoneNumber = scanner.next();
}
public String getDepartureDateTime(){
    System.out.println("Please enter the Date and Time you will be departing for your trip: ");
    return departureDateTime = scanner.next();
    }
public void getTripCode(){
    System.out.println("Please enter the number for the trip you want to take. Trips are displayed origin-destinations. ");
    System.out.println(
            "   1. DCA_NYA,\n" +
            "   2. DCA_LAA,\n" +
            "   3. DCA_ORD,\n" +
            "   4. DCA_ATL,\n" +
            "   5. NYA_ATL,\n" +
            "   6. NYA_LAA,\n" +
            "   7. NYA_ORD,\n" +
            "   8. ATL_LAA,\n" +
            "   9. ATL_ORD");
    int choice = scanner.nextInt();
    switch(choice){
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
}
public void confirmPassengerInfo(){
    System.out.println("Please confirm the following info is correct: \n"+
            "Full Name: "+firstName + " "+ lastName+"\n"+
            "Age: "+age+"\n"+
            "Email Address: "+email + "\n"+
            "Gender: "+gender+"\n"+
            "Phone Number: "+phoneNumber+"\n"+
            "Depature Date/Time: "+ departureDateTime + "\n"+
            "Trip Code: "+ trip);
    System.out.println("Please enter 1 to confirm or 2 for incorrect data");
    int confirmInfo = scanner.nextInt();
    if (confirmInfo == 1){
        System.out.println("Entry confirmed");
    }else if (confirmInfo == 2){
        System.out.println("Please try enter info again.");
        }
    }
}
