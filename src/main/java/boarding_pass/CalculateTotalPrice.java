package boarding_pass;


public class CalculateTotalPrice {

    public static void getTotalPrice(){
    //Need to get tripcode value from PriceList and set as trip cost.
    float tripCost = 0;
        if (PassengerInfo.gender == "female" || PassengerInfo.gender == "Female"){
        tripCost = tripCost % 25;
    }
    if(PassengerInfo.age <= 12){
        tripCost = tripCost % 50;
    }
    if (PassengerInfo.age >= 60) {
        tripCost = tripCost % 60;
    }
    }


}
