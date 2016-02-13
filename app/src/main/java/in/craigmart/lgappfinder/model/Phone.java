package in.craigmart.lgappfinder.model;

import android.graphics.drawable.Drawable;

import java.util.List;

/**
 * Created by craig on 1/3/2016.
 */
public class Phone {

    public int image;
    public List<Carrier> carriers;
    public String string;

    public Phone(int image, List<Carrier> carriers, String string) {
        this.image = image;
        this.carriers = carriers;
        this.string = string;
    }
}
