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
        if (PassengerInfo.gender.equals("Male") || PassengerInfo.gender.equals("male")) {
            afterDiscountCost = tripCost;
        }
        if (PassengerInfo.gender.equals("Female")){
            discount = tripCost * 0.25;
            afterDiscountCost = tripCost - discount;
        }
        if(PassengerInfo.age <= 12){
            discount = tripCost * 0.50;
            if (afterDiscountCost != 0){
                afterDiscountCost = afterDiscountCost - discount;

            } else {
                afterDiscountCost = tripCost - discount;
            }

        }
        if (PassengerInfo.age >= 60) {
            discount = tripCost * 0.60;
            if (afterDiscountCost != 0){
                afterDiscountCost = afterDiscountCost - discount;
            } else {
                afterDiscountCost = tripCost - discount;
            }
        }
     }

     return afterDiscountCost;
    }
}