
package edu.temple.colorpicker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Resources res = this.getResources();
        final String [] gridlabels = res.getStringArray(R.array.colors);
        final String [] gridlabelsEng = res.getStringArray(R.array.engColors);

        TextView textView;
        int colorNum = getIntent().getIntExtra("colorName",1 );

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        textView = findViewById(R.id.textView2);
        textView.setText(gridlabels[colorNum]);
        textView.setTextSize(30);
        textView.setTextColor(Color.BLACK);
        if(colorNum == 6)
        {
            textView.setTextColor(Color.WHITE);

        }
        findViewById(R.id.backgroundID).setBackgroundColor(Color.parseColor(gridlabelsEng[colorNum]));


    }
}