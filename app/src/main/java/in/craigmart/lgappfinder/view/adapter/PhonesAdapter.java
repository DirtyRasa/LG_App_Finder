package in.craigmart.lgappfinder.view.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import in.craigmart.lgappfinder.R;
import in.craigmart.lgappfinder.databinding.ItemPhoneBinding;
import in.craigmart.lgappfinder.model.Phone;
import in.craigmart.lgappfinder.viewModel.PhoneViewModel;

/**
 * Created by craig on 1/5/2016.
 */
public class PhonesAdapter extends RecyclerView.Adapter<PhonesAdapter.BindingHolder> {

    private Context mContext;
    private List<Phone> mPhones;

    public PhonesAdapter(Context context) {
        mContext = context;
        mPhones = new ArrayList<>();
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemPhoneBinding phoneBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_phone,
                parent,
                false);
        return new BindingHolder(phoneBinding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        ItemPhoneBinding phoneBinding = holder.binding;
        phoneBinding.setViewModel(new PhoneViewModel(mContext, mPhones.get(position)));
    }

    @Override
    public int getItemCount() {
        return mPhones.size();
    }

    public void setItems(List<Phone> phones) {
        mPhones = phones;
        notifyDataSetChanged();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ItemPhoneBinding binding;

        public BindingHolder(ItemPhoneBinding binding) {
            super(binding.itemPhoneLayout);
            this.binding = binding;
        }
    }
}
