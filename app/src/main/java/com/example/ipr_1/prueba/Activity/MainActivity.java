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

import com.example.ipr_1.prueba.R;

public class MainActivity extends AppCompatActivity {
    private Button btnSiguiente;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);
        txtNombre = (EditText)findViewById(R.id.editText);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        switch (item.getItemId()){
            case R.id.action_settings:
                Intent config=
                        new Intent(MainActivity.this,ConfigActivity.class);
                startActivity(config);
                break;
            case R.id.action_acercaDe:
                Intent acerca=
                        new Intent(MainActivity.this, acercaDeActivity.class);
                startActivity(acerca);
                break;
            case R.id.action_Listado:
                Intent list=
                        new Intent(MainActivity.this, ListadoActivity.class);
                startActivity(list);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
