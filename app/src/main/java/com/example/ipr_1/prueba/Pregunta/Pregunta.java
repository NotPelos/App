package com.example.ipr_1.prueba.Pregunta;

public class Pregunta {
    private int ID;
    private String nombre, categoria;
    private String correcta, incorrecta, incorrecta2, incorrecta3;

    public Pregunta(String nombre, String correcta, String incorrecta, String incorrecta2, String incorrecta3, String categoria) {
        this.categoria=categoria;
        this.nombre = nombre;
        this.correcta = correcta;
        this.incorrecta = incorrecta;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
    }

    public Pregunta(int ID, String nombre, String correcta, String incorrecta, String incorrecta2, String incorrecta3,String categoria) {
        this.categoria=categoria;
        this.ID = ID;
        this.nombre = nombre;
        this.correcta = correcta;
        this.incorrecta = incorrecta;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
    }

    public int getID() {
        return ID;
    }

    public String getCategoria() {return categoria; }

    public String getNombre() {
        return nombre;
    }

    public String getCorrecta() {
        return correcta;
    }

    public String getIncorrecta() {
        return incorrecta;
    }

    public String getIncorrecta2() {
        return incorrecta2;
    }

    public String getIncorrecta3() {
        return incorrecta3;
    }
}
