package com.example.owner.gridviewv4;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Owner on 2/7/2018.
 */

public class GridviewAdapter extends BaseAdapter{
    private Context context;
    public ArrayList arrayList = new ArrayList();

    public GridviewAdapter(Context context, ArrayList arrayList) {
        this.context = context;
        arrayList.clear();
        arrayList.addAll(arrayList);
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        TextView textView = new TextView(context);
        LinearLayout linearLayout = new LinearLayout(context);

        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new AbsListView.LayoutParams(
                AbsListView.LayoutParams.MATCH_PARENT, 250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(5,5,5,5);
        imageView.setCropToPadding(true);

        textView.setLayoutParams(new AbsListView.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        textView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);

        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 250));
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        linearLayout.addView(imageView);
        linearLayout.addView(textView);

        return linearLayout;
    }
}
