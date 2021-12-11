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

public class MuseumsZooFragmentFive extends Fragment {

    public MuseumsZooFragmentFive() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.museum_5_1, getString(R.string.title_entrance_door),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_5_2, getString(R.string.title_steam_lokomotives),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_5_3, getString(R.string.title_biggest_steam_lokomotives),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_5_4, getString(R.string.title_biggest_armored_lokomotives),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_5_5, getString(R.string.title_railway_traveling_throught),
                ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels, ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_museums_railways);
        information.setText(R.string.info_museums_railways);
        address.setText(R.string.address_museums_railways);
        phoneNumber.setText(R.string.phone_museums_railways);
        workTime.setText(R.string.work_time_museums_railways);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.297860712841576,69.26894864479982"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_museums_railways)));
                startActivity(intent);
            }
        });

        return view;
    }
}
