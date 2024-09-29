package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private final String[] gridLabels;
    private final int[] gridImages;

    public CustomAdapter(Context context, String[] gridLabels, int[] gridImages) {
        this.context = context;
        this.gridLabels = gridLabels;
        this.gridImages = gridImages;
    }

    @Override
    public int getCount() {
        return gridLabels.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.grid_text);

        imageView.setImageResource(gridImages[position]);
        textView.setText(gridLabels[position]);

        return convertView;
    }
}
