package com.hades.typeview.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Hades on 9/15/2018.
 */
public class BindingUtils {

    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView image, String url) {
        Glide.with(image).load(url).into(image);
    }

}
