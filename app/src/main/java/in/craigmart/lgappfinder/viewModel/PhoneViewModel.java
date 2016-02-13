package in.craigmart.lgappfinder.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

import in.craigmart.lgappfinder.R;
import in.craigmart.lgappfinder.model.Phone;

/**
 * Created by craig on 1/3/2016.
 */
public class PhoneViewModel extends BaseObservable {

    private Phone mPhone;

    public PhoneViewModel(Phone phone) {
        mPhone = phone;
    }

    @Bindable
    public int getPhoneImage() {
        return mPhone.image;
    }

    @Bindable
    public String getString() {
        return mPhone.string;
    }
}
