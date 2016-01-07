package in.craigmart.lgappfinder.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.graphics.drawable.Drawable;

import in.craigmart.lgappfinder.model.Phone;

/**
 * Created by craig on 1/3/2016.
 */
public class PhoneViewModel extends BaseObservable {

    private Context mContext;
    private Phone mPhone;

    public PhoneViewModel(Context context, Phone phone) {
        mContext = context;
        mPhone = phone;
    }

    @Bindable
    public int getPhoneImage() {
        return mPhone.image;
    }
}
