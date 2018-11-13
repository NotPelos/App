package com.example.ipr_1.prueba.Persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BD extends SQLiteOpenHelper {

    //DataBase version

    private static final int DATABASE_VERSION = 1;

    //DataBase Name
    private static final String DATABASE_NAME = "preguntas.db";

    //Table name
    private static final String TABLE_NAME = "preguntas";

    //Table fields
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NOMBRE = "nombre";
    private static final String COLUMN_CORRECTA = "correcta";
    private static final String COLUMN_INCORRECTA = "incorrecta";
    private static final String COLUMN_INCORRECTA2 = "incorrecta2";
    private static final String COLUMN_INCORRECTA3 = "incorrecta3";


    SQLiteDatabase db;




    public BD (Context contexto, String preguntas, Object o, int i) {
        super(contexto, DATABASE_NAME, null, DATABASE_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creación de la tabla
        db.execSQL("CREATE TABLE " + TABLE_NAME + "( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_NOMBRE+" TEXT, "+ COLUMN_CORRECTA + " TEXT, " + COLUMN_INCORRECTA + " TEXT, " + COLUMN_INCORRECTA2 + " TEXT, " + COLUMN_INCORRECTA3 + " TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        //NOTA: Por simplicidad del ejemplo aquí utilizamos directamente la opción de
        //      eliminar la tabla anterior y crearla de nuevo vacía con el nuevo formato.
        //      Sin embargo lo normal será que haya que migrar datos de la tabla antigua
        //      a la nueva, por lo que este método debería ser más elaborado.

        //Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);


    }
}
