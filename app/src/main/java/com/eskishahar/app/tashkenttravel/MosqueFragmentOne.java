package com.eskishahar.app.tashkenttravel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MosqueFragmentOne extends Fragment {

    public MosqueFragmentOne() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mosque_1_0,getString(R.string.title_general_view),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_1_1,getString(R.string.title_mosque_yard),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_1_2,getString(R.string.title_nica_day),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_1_3,getString(R.string.title_khonakoh),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_1_4,getString(R.string.title_khonakoh),
                ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_mosque_khazrati_imam);
        information.setText(R.string.info_mosque_khazrati_imam);
        address.setText(R.string.address_mosque_khazrati_imam);
        phoneNumber.setText(R.string.phone_mosque_khazrati_imam);
        workTime.setText(R.string.work_time_mosque_khazrati_imam);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.3374303,69.2412774,15?q=41.3374303,69.2412774,15(Khazrati Imam)"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_mosque_khazrati_imam)));
                startActivity(intent);
            }
        });

        return view;
    }
}
