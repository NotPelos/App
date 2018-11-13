package com.example.ipr_1.prueba;

public class Pregunta {
    private int ID;
    private String nombre;
    private String correcta, incorrecta, incorrecta2, incorrecta3;

    public Pregunta(String nombre, String correcta, String incorrecta, String incorrecta2, String incorrecta3) {
        this.nombre = nombre;
        this.correcta = correcta;
        this.incorrecta = incorrecta;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
    }

    public Pregunta(int ID, String nombre, String correcta, String incorrecta, String incorrecta2, String incorrecta3) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public String getIncorrecta() {
        return incorrecta;
    }

    public void setIncorrecta(String incorrecta) {
        this.incorrecta = incorrecta;
    }

    public String getIncorrecta2() {
        return incorrecta2;
    }

    public void setIncorrecta2(String incorrecta2) {
        this.incorrecta2 = incorrecta2;
    }

    public String getIncorrecta3() {
        return incorrecta3;
    }

    public void setIncorrecta3(String incorrecta3) {
        this.incorrecta3 = incorrecta3;
    }
}
