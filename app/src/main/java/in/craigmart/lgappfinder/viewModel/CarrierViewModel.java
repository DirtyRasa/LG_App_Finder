package in.craigmart.lgappfinder.viewModel;

import android.databinding.BaseObservable;

import in.craigmart.lgappfinder.model.Carrier;

/**
 * Created by craig on 1/3/2016.
 */
public class CarrierViewModel extends BaseObservable {

    private Carrier carrier;

    public Carrier.CarrierName getCarrier() {
        return carrier.Name;
    }
}
