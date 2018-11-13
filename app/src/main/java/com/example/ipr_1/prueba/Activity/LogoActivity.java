package com.example.ipr_1.prueba.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.ipr_1.prueba.Log.Mylog;
import com.example.ipr_1.prueba.R;

public class LogoActivity extends AppCompatActivity {
    private static final String TAG="InicioActivity";
    private static int  TIEMPO = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Mylog.d(TAG, "Iniciando OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent it = new Intent(LogoActivity.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        },TIEMPO);
        Mylog.d(TAG, "Finalizando OnCreate");
    }

    @Override
    protected void onStart() {
        Mylog.d(TAG, "Iniciando OnStart");
        super.onStart();
        Mylog.d(TAG, "Finalizando OnStart");
    }

    @Override
    protected void onResume() {
        Mylog.d(TAG, "Iniciando OnResume");
        super.onResume();
        Mylog.d(TAG, "Finalizando OnResume");
    }

    @Override
    protected void onPause() {
        Mylog.d(TAG, "Iniciando OnPause");
        super.onPause();
        Mylog.d(TAG, "Finalizando OnPause");
    }

    @Override
    protected void onStop() {
        Mylog.d(TAG, "Iniciando OnStop");
        super.onStop();
        Mylog.d(TAG, "Finalizando OnStop");
    }

    @Override
    protected void onRestart() {
        Mylog.d(TAG, "Iniciando OnRestart");
        super.onRestart();
        Mylog.d(TAG, "Finalizando OnRestart");
    }

    @Override
    protected void onDestroy() {
        Mylog.d(TAG, "Iniciando OnDestroy");
        super.onDestroy();
        Mylog.d(TAG, "Finalizando OnDestroy");
    }
}
