package com.cookandroid.bmi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.util.ArrayList;

public class imageAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Integer> mThumbIds = null;

    public imageAdapter(Context c, ArrayList<Integer> mThumbIds)
    {
        mContext = c;
        this.mThumbIds = mThumbIds;
    }

    @Override
    public int getCount() {
        return mThumbIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView i = new ImageView(mContext);
        i.setImageResource(mThumbIds.get(position));
        i.setLayoutParams(new Gallery.LayoutParams(400,400));
        i.setScaleType(ImageView.ScaleType.FIT_XY);

        return i;
    }
}
