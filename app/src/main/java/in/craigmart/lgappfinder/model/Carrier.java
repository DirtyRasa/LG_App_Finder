package in.craigmart.lgappfinder.model;

/**
 * Created by craig on 1/3/2016.
 */
public class Carrier {

    public enum CarrierName {
        ATT,
        VERIZON,
        SPRINT,
        BESTBUY,
        USCELLULAR,
        TMOBILE
    }

    public Apk apk;
    public CarrierName Name;

    public Carrier() {}
}
