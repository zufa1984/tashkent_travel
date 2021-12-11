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

public class ShoppingsFragmentThree extends Fragment {

    public ShoppingsFragmentThree() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.shopping_3_1,getString(R.string.title_antique_furnitures), ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.shopping_3_2,getString(R.string.title_unique_jewelry),ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.shopping_3_3,getString(R.string.title_antiques),ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.shopping_3_4,getString(R.string.title_old_musical_instruments),ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.shopping_3_5,getString(R.string.title_pet_shops),ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);

        TextView name = view.findViewById(R.id.name);
        TextView information = view.findViewById(R.id.info);
        TextView address = view.findViewById(R.id.address);
        LinearLayout locationButton = view.findViewById(R.id.location);
        LinearLayout phoneButton = view.findViewById(R.id.phone_btn);

        TextView phoneNumber = view.findViewById(R.id.phone_text);
        TextView workTime = view.findViewById(R.id.work_time);

        name.setText(R.string.name_shopping_yangiabad);
        information.setText(R.string.info_shopping_yangiabad);
        address.setText(R.string.address_shopping_yangiabad);
        phoneNumber.setText(R.string.phone_shopping_yangiabad);
        workTime.setText(R.string.work_time_shopping_yangiabad);

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:41.2585846,69.3525647"));
                startActivity(intent);
            }
        });

        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(getString(R.string.phone_shopping_yangiabad)));
                startActivity(intent);
            }
        });

        return view;
    }
}
