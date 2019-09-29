package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openmaps(View view) {
        String map = "Depoksari raya No. 6B, Tlogosari Kulon, Semarang";

        Uri addressUri = Uri.parse("geo:0,0?q=" + map);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }

    public void opencall(View view) {
        Uri number = Uri.parse("tel:+6285865368120");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void openmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"111201710519@mhs.dinus.ac.id"});

        try {
            startActivity(Intent.createChooser(intent, "Pilih Satu"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }
}
