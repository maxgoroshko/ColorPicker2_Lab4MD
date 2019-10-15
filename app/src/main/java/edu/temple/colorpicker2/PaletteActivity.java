package edu.temple.colorpicker2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
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

        //final String[] colors = {"Choose a color", "Red", "Blue", "Green", "Magenta", "Purple", "Black", "Yellow", "White", "Cyan", "Grey"};

        Resources res = this.getResources();
        final String [] gridlabels = res.getStringArray(R.array.colors);

        final Spinner spinner = findViewById(R.id.spinner);
        ColorAdapter adapter = new ColorAdapter(this,gridlabels);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!gridlabels[position].equals("Choose a color")) {
                    Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    intent.putExtra("colorName", gridlabels[position]);
                    startActivity(intent);
                    spinner.setSelection(0,false);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }
}
