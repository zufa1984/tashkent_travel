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

public class MosqueFragmentFour extends Fragment {

    public MosqueFragmentFour() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mosque_4_0,getString(R.string.title_general_view),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_1,getString(R.string.title_khonakoh),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_2,getString(R.string.title_welcoma),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_3,getString(R.string.title_mesmerizing_dome),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_4,getString(R.string.title_good_night),
                ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_mosque_islam_ota);
        information.setText(R.string.info_mosque_islam_ota);
        address.setText(R.string.address_mosque_islam_ota);
        phoneNumber.setText(R.string.phone_mosque_islam_ota);
        workTime.setText(R.string.work_time_mosque_islam_ota);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.2770776,69.3092619"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_mosque_islam_ota)));
                startActivity(intent);
            }
        });

        return view;
    }
}
