package in.craigmart.lgappfinder.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.craigmart.lgappfinder.R;
import in.craigmart.lgappfinder.model.Phone;
import in.craigmart.lgappfinder.view.adapter.PhonesAdapter;

/**
 * Created by craig on 1/3/2016.
 */
public class PhonesActivity extends AppCompatActivity {

    RecyclerView mListPhones;

    private PhonesAdapter mPhoneAdapter;
    private List<Phone> mPhones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        mPhones = new ArrayList<>();
        mPhones.add(new Phone(R.drawable.selector_lg_v10, null));

        mPhoneAdapter = new PhonesAdapter(this);
        mPhoneAdapter.setItems(mPhones);

        mListPhones = (RecyclerView)findViewById(R.id.recycler_phones);
        mListPhones.setLayoutManager(new LinearLayoutManager(this));
        mListPhones.setAdapter(mPhoneAdapter);
    }
}
