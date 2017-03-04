package com.example.rent.databinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by RENT on 2017-02-22.
 */

public class ImageUrlBindingAdapter {

    @BindingAdapter("loadUrl")
    public static void bindImage(ImageView imageWiew, String url) {
        Glide.with(imageWiew.getContext()).load(url).into(imageWiew);
    }
}
