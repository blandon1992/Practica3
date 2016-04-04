package com.joseblandon.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.acercaDe) {
            Intent i= new Intent(this, AcercaDe.class);
            startActivity(i);
        }
       if (id== R.id.turismo){
            Intent i= new Intent(this, Sitios_Turisticos.class);
            startActivity(i);
        }

        if (id== R.id.hoteles){
            Intent i= new Intent(this, Hoteles.class);
            startActivity(i);
        }

        if (id== R.id.bares){
            Intent i= new Intent(this, Bares.class);
            startActivity(i);
        }

        if (id== R.id.informacion){
            Intent i= new Intent(this, demografica.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
