/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: PassengerInfo - class for passenger input
 */
package boarding_pass;

import java.util.Scanner;

public class PassengerInfo {

    //Fields
    String firstName;
    String lastName;
    String email;
    String gender;
    int age;
    String phoneNumber;


    //Constructor
    public PassengerInfo() {
    }

    public PassengerInfo(String firstName, String lastName, String email, String gender, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //ToString

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
