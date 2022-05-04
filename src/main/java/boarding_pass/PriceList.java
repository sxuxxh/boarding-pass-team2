/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: PriceList - class to provide price for predefined trips
 */
package boarding_pass;

import java.util.Map;

public final class PriceList {
    // Fields
    private Map<TripCode, Double> priceLst;

    // Constructors
    public PriceList() {
    }

    public PriceList(Map<TripCode, Double> priceLst) {
        this.priceLst = priceLst;
    }

    // Getters
    public Map<TripCode, Double> getPriceLst() {
        return priceLst;
    }

    // ToString
    @Override
    public String toString() {
        return "PriceList{" +
                "priceLst=" + priceLst +
                '}';
    }

    // Method: populatePriceLst
    public void populatePriceLst() {
        this.priceLst.put(TripCode.DCA_NYA, 250.00);
        this.priceLst.put(TripCode.DCA_LAA, 650.00);
        this.priceLst.put(TripCode.DCA_ORD, 350.00);
        this.priceLst.put(TripCode.DCA_ATL, 420.00);
        this.priceLst.put(TripCode.NYA_ATL, 450.00);
        this.priceLst.put(TripCode.NYA_LAA, 660.00);
        this.priceLst.put(TripCode.NYA_ORD, 230.00);
        this.priceLst.put(TripCode.ATL_LAA, 530.00);
        this.priceLst.put(TripCode.ATL_ORD, 330.00);
    }
}
