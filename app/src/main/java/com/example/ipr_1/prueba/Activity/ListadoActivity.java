package com.example.ipr_1.prueba.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.ipr_1.prueba.R;

public class ListadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Crear Boton atras
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton mas = (FloatingActionButton) findViewById(R.id.MasButton);
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent crear = new Intent(ListadoActivity.this, CrearListadoActivity.class);
                startActivity(crear);
            }
        });

    }

    //Funcionar boton atras
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        if(id==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
