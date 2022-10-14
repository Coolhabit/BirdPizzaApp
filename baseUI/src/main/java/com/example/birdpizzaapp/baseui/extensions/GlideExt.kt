package com.example.birdpizzaapp.baseui.extensions

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.request.RequestOptions
import com.example.birdpizzaapp.baseui.extensions.getDrawableCompat

fun ImageView.load(
    url: String?,
    @DrawableRes defaultImgRes: Int? = null,
    builder: ((RequestBuilder<Drawable>) -> RequestBuilder<Drawable>)? = null,
) {
    var requestOptions = RequestOptions()

    if (defaultImgRes != null) {
        val defaultImg = context.getDrawableCompat(defaultImgRes)
        requestOptions = requestOptions.error(defaultImg).placeholder(defaultImg)
    }

    Glide.with(context)
        .load(url)
        .apply(requestOptions)
        .let {
            builder?.invoke(it) ?: it
        }
        .into(this)
}
