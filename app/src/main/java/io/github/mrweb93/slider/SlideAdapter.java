package io.github.mrweb93.slider;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.jetbrains.annotations.NotNull;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_image={
    R.drawable.image_1,
    R.drawable.image_2,
    R.drawable.image_3,
    R.drawable.image_4
    };

    public String[] list_title={
            "COSMONAUT",
            "SATELITE",
            "GALAXY",
            "ROCKET"
    };

    public String[] list_description={
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4"
    };

    public int[] list_background={
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212)
    };

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout) object);
    }

    @NonNull
    @NotNull
    @Override
    public Object instantiateItem(@NonNull @NotNull View container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull @NotNull ViewGroup container, int position, @NonNull @NotNull Object object) {
        super.destroyItem(container, position, object);
    }
}
