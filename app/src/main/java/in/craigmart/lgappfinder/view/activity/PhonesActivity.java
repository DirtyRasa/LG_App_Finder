package in.craigmart.lgappfinder.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import in.craigmart.lgappfinder.R;
import in.craigmart.lgappfinder.model.Phone;
import in.craigmart.lgappfinder.view.adapter.PhonesAdapter;
import in.craigmart.lgappfinder.viewModel.PhoneViewModel;

/**
 * Created by craig on 1/3/2016.
 */
public class PhonesActivity extends Activity {

    private List<PhoneViewModel> mPhoneViewModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        mPhoneViewModelList = new ArrayList<>();
        mPhoneViewModelList.add(new PhoneViewModel(this, new Phone(R.drawable.selector_lg_v10, null)));

        PhonesAdapter phoneAdapter = new PhonesAdapter(this, mPhoneViewModelList);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(phoneAdapter);
    }
}
