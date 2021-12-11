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

public class MuseumsZooFragmentTwo extends Fragment {

    public MuseumsZooFragmentTwo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.museum_2_1,getString(R.string.title_entrance_door),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_2_2,getString(R.string.title_black_bears),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_2_3,getString(R.string.title_pride_of_lions),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_2_4,getString(R.string.title_asian_elephant),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.museum_2_5,getString(R.string.title_welcoming_peacock),
                ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_museums_zoo);
        information.setText(R.string.info_museums_zoo);
        address.setText(R.string.address_museums_zoo);
        phoneNumber.setText(R.string.phone_museums_zoo);
        workTime.setText(R.string.work_time_museums_zoo);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.343607,69.309977"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_museums_zoo)));
                startActivity(intent);
            }
        });

        return view;
    }
}
