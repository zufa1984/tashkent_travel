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

public class HotelsFragmentThree extends Fragment {

    public HotelsFragmentThree() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.hotel_3_1, getString(R.string.title_general_view),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.hotel_3_2, getString(R.string.title_rooms),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.hotel_3_3, getString(R.string.title_pool),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.hotel_3_4, getString(R.string.title_dinning),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.hotel_3_5, getString(R.string.title_bath_room),
                ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels, ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_hotel_ichan_qala);
        information.setText(R.string.info_hotel_ichan_qala);
        address.setText(R.string.address_hotel_ichan_qala);
        phoneNumber.setText(R.string.phone_hotel_ichan_qala);
        workTime.setText(R.string.work_time_hotel_ichan_qala);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.2925101,69.2576599"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_hotel_ichan_qala)));
                startActivity(intent);
            }
        });

        return view;
    }
}


