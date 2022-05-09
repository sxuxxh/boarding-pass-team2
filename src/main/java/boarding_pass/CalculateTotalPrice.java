package boarding_pass;


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
                discount = tripCost * 0.5;
                afterDiscountCost = afterDiscountCost - discount;
            } else {
                discount = tripCost * 0.5;
                afterDiscountCost = tripCost - discount;
            }

        }
        if (PassengerInfo.age >= 60) {
            if (afterDiscountCost != 0){
                discount = tripCost * 0.6;
                afterDiscountCost = afterDiscountCost - discount;
            } else {
                discount = tripCost * 0.6;
                afterDiscountCost = tripCost - discount;
            }
        }
     }
     return afterDiscountCost;
    }
}