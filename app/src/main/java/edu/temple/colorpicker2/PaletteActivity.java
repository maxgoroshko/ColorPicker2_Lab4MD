package edu.temple.colorpicker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final String[] colors = {"Choose a color", "Red", "Blue", "Green", "Magenta", "Purple", "Black", "Yellow", "White", "Cyan", "Grey"};

        Spinner spinner = findViewById(R.id.spinner);
        ColorAdapter adapter = new ColorAdapter(this,colors);
        spinner.setAdapter(adapter);
        spinner.setSelection(0,false);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TextView textView = (TextView) view;
                //String colorValue = textView.getText().toString();

                Intent intent = new Intent(PaletteActivity.this,CanvasActivity.class);
                intent.putExtra("colorName",colors[position]);
                startActivity(intent);

                /*
                try {
                    findViewById(R.id.backgroundID).setBackgroundColor(Color.parseColor(textView.getText().toString()));
                }
                catch (Exception e)
                {
                    findViewById(R.id.backgroundID).setBackgroundColor(Color.WHITE);
                }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }
}
