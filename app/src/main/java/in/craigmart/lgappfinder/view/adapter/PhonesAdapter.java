package in.craigmart.lgappfinder.view.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

import in.craigmart.lgappfinder.R;
import in.craigmart.lgappfinder.viewModel.PhoneViewModel;

/**
 * Created by craig on 1/5/2016.
 */
public class PhonesAdapter extends ArrayAdapter<PhoneViewModel>{

    private Activity mContext;
    private List<PhoneViewModel> mPhoneViewModels;

    public PhonesAdapter(Activity context, List<PhoneViewModel> phoneViewModels) {
        super(context, R.layout.item_phone, phoneViewModels);

        mContext = context;
        mPhoneViewModels = phoneViewModels;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = mContext.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.item_phone, null, true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageButton);

        imageView.setImageResource(mPhoneViewModels.get(position).getPhoneImage());

        return rowView;
    }
}
