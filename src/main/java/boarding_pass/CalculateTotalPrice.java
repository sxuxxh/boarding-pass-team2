package boarding_pass;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class CalculateTotalPrice {

    public static double getTotalPrice(int age, String gender, TripCode tripCode){
    //Need to get tripcode value from PriceList and set as trip cost.
        double tripCost = 0;
        double discount = 0;
        double afterDiscountCost = 0;

    for(TripCode key: BoardingPass.priceList.getPriceLst().keySet()) {
        if (key.equals(tripCode)){
            tripCost = BoardingPass.priceList.getPriceLst().get(key);
        }
        if (PassengerInfo.gender.equals("Female") || PassengerInfo.gender.equals("female")){
            discount = tripCost * 0.25;
            afterDiscountCost = tripCost - discount;
        }
        if(PassengerInfo.age <= 12){
            if (afterDiscountCost != 0){
                discount = tripCost * 0.50;
                afterDiscountCost = afterDiscountCost - discount;
            } else {
                discount = tripCost * 0.50;
                afterDiscountCost = tripCost - discount;
            }

        }
        if (PassengerInfo.age >= 60) {
            if (afterDiscountCost != 0){
                discount = tripCost * 0.60;
                afterDiscountCost = afterDiscountCost - discount;
            } else {
                discount = tripCost * 0.60;
                afterDiscountCost = tripCost - discount;
            }
        }
        if(PassengerInfo.gender.equals("Male") || PassengerInfo.gender.equals("male") && PassengerInfo.age > 12 && PassengerInfo.age < 60){
            afterDiscountCost = tripCost;
        }
     }

     return afterDiscountCost;
    }
}