package edu.temple.colorpicker2;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;

    String[] colors;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView instanceof View){
            textView = (TextView) convertView;
        } else {
            textView = new TextView(context);
        }
        textView.setTextSize(23);
        textView.setTextColor(Color.BLACK);
        textView.setText(colors[position]);
        textView.setBackgroundColor(Color.WHITE);
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView textView;

        if (convertView instanceof View){
            textView = (TextView) convertView;
        } else {
            textView = new TextView(context);
        }
        textView.setTextSize(23);
        textView.setText(colors[position]);

        try{
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.parseColor(textView.getText().toString()));
        }
        catch (Exception e)
        {
            textView.setTextColor(Color.BLACK);
            textView.setBackgroundColor(Color.WHITE);
        }

        return textView;
    }
}



