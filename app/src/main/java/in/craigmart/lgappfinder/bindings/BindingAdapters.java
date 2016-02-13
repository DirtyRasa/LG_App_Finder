package in.craigmart.lgappfinder.bindings;

import android.databinding.BindingAdapter;
import android.widget.ImageButton;

/**
 * Created by craig on 1/13/2016.
 * Place for custom binding adapters
 */
public class BindingAdapters {
    @BindingAdapter("imageButtonSource")
    public static void setImageButtonSource(ImageButton imageButton, int drawable) {
        imageButton.setImageResource(drawable);
    }
}
