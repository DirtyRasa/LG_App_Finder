package in.craigmart.lgappfinder.viewModel;

import android.databinding.BaseObservable;
import android.media.Image;

import in.craigmart.lgappfinder.model.Apk;

/**
 * Created by craig on 1/3/2016.
 */
public class ApkViewModel extends BaseObservable {

    private Apk apk;

    public Image getQRCode() {
        return apk.QRCode;
    }
}
