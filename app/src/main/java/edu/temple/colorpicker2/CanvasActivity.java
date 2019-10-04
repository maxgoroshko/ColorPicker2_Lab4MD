
package edu.temple.colorpicker2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView;
        String color = getIntent().getStringExtra("colorName");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        textView = findViewById(R.id.textView2);
        textView.setText(color);
        textView.setTextSize(30);
        textView.setTextColor(Color.BLACK);
        if(color.equals("Black"))
        {
            textView.setTextColor(Color.WHITE);

        }
        findViewById(R.id.backgroundID).setBackgroundColor(Color.parseColor(color));


    }
}