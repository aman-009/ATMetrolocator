package com.example.amanmehta.atmetrolocator;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

/**
 * Created by amanmehta on 22/07/17.
 */

public class stationlistadapter extends ArrayAdapter<station> {

    private Context mcontext;
    private int mResourse;
    int lastPosition = -1;

    public stationlistadapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<station> objects) {
        super(context, resource, objects);
        mcontext = context;
        mResourse = resource;
    }
//

    static class ViewHolder {
        TextView activityName;
        ImageView activityImgurl;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SetupImageLoader();
        String name = getItem(position).getActivity_name();
        String imgurl = getItem(position).getActivity_imgURL();
        ViewHolder holder;
        View result;

        if(convertView == null) {
            LayoutInflater inflator = LayoutInflater.from(mcontext); //get a layout inflator from given context
            convertView = inflator.inflate(mResourse, parent, false);
            holder = new ViewHolder();
            holder.activityName = (TextView) convertView.findViewById(R.id.act_name);
            holder.activityImgurl = (ImageView) convertView.findViewById(R.id.act_image);

            convertView.setTag(holder);
            result = convertView;
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mcontext,
                (position > lastPosition)? R.anim.load_down_anim :R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;




        int fallback =  mcontext.getResources().getIdentifier("@drawable/image_failed", null, mcontext.getPackageName());

        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(fallback)
                .showImageOnFail(fallback)
                .showImageOnLoading(fallback).build();



//download and display image from url
        imageLoader.displayImage(imgurl, holder.activityImgurl, options);


        holder.activityName.setText(name);
        return convertView;
    }


    private void SetupImageLoader(){
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mcontext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
    }
}
