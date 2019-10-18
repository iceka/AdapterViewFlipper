package com.ceka.adapterviewflipper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private String[] heroNames;
    private int[] backgroundColors;
    private Context mContext;

    public MyAdapter(Context context, String[] heroNames, int[] backgroundColors) {
        this.mContext = context;
        this.heroNames = heroNames;
        this.backgroundColors = backgroundColors;
    }

    @Override
    public int getCount() {
        return heroNames.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false);
        RelativeLayout layout = view.findViewById(R.id.layout_item);
        TextView textView = view.findViewById(R.id.tv_hero_name);
        layout.setBackgroundColor(backgroundColors[i]);
        textView.setText(heroNames[i]);
        return view;
    }
}
