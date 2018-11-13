package com.example.ipr_1.prueba.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.example.ipr_1.prueba.Log.Mylog;
import com.example.ipr_1.prueba.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_Nuevo:
                Mylog.i("ActionBar","Crear");
                Intent crear=
                        new Intent(MainActivity.this, CrearListadoActivity.class);
                startActivity(crear);
                break;
            case R.id.action_settings:
                Mylog.i("ActionBar", "Settings");
                Intent config=
                        new Intent(MainActivity.this,ConfigActivity.class);
                startActivity(config);
                break;
            case R.id.action_acercaDe:
                Mylog.i("ActionBar","AcercaDe");
                Intent acerca=
                        new Intent(MainActivity.this, acercaDeActivity.class);
                startActivity(acerca);
                break;
            case R.id.action_Listado:
                Mylog.i("ActionBar","Listado");
                Intent list=
                        new Intent(MainActivity.this, ListadoActivity.class);
                startActivity(list);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
