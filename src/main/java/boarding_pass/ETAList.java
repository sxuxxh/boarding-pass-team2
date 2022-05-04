/*
  FSE Cohort - Team Project1
  BoardingPass-Team2
  Class: ETAList - class to provide estimated number of hours to arrival
 */
package boarding_pass;

import java.util.Map;

public final class ETAList {
    // Fields
    private Map<TripCode, Float> etaLst;

    // Constructors
    public ETAList() {
    }

    public ETAList(Map<TripCode, Float> etaLst) {
        this.etaLst = etaLst;
    }


    // Getters
    public Map<TripCode, Float> getEtaLst() {
        return etaLst;
    }

    // ToString
    @Override
    public String toString() {
        return "ETAList{" +
                "etaLst=" + etaLst +
                '}';
    }

    // Method
    public void populateETALst() {
        this.etaLst.put(TripCode.DCA_NYA, 1.5f);
        this.etaLst.put(TripCode.DCA_LAA, 5.5f);
        this.etaLst.put(TripCode.DCA_ORD, 2.5f);
        this.etaLst.put(TripCode.DCA_ATL, 1.5f);
        this.etaLst.put(TripCode.NYA_ATL, 2.5f);
        this.etaLst.put(TripCode.NYA_LAA, 5.5f);
        this.etaLst.put(TripCode.NYA_ORD, 1.1f);
        this.etaLst.put(TripCode.ATL_LAA, 4.5f);
        this.etaLst.put(TripCode.ATL_ORD, 3.5f);
    }
}
