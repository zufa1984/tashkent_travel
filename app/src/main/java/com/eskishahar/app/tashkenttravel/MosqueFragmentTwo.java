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

public class MosqueFragmentTwo extends Fragment {

    public MosqueFragmentTwo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mosque_2_0,getString(R.string.title_dawn),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_2_1,getString(R.string.title_khonakoh),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_2_2,getString(R.string.title_wash_room),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_2_3,getString(R.string.title_under_the_floor),
                ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_2_4,getString(R.string.title_toilets),
                ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_mosque_sheikh_zayniddin);
        information.setText(R.string.info_mosque_sheikh_zayniddin);
        address.setText(R.string.address_mosque_sheikh_zayniddin);
        phoneNumber.setText(R.string.phone_mosque_sheikh_zayniddin);
        workTime.setText(R.string.work_time_mosque_sheikh_zayniddin);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.3227686, 69.204871"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_mosque_sheikh_zayniddin)));
                startActivity(intent);
            }
        });

        return view;
    }
}
