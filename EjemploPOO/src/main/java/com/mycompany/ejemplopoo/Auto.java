package com.mycompany.ejemplopoo;

//Clase Hija de Vehiculo.

public class Auto extends Vehiculo {

//Declarando Atributos:
    private int id;
    public String patente;
    private int cant_puertas;
    private String color;
    private boolean caja_manual;
    
//Constructores:

    public Auto(int id, String patente, int cant_puertas, String color, boolean caja_manual, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.id = id;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }

    public Auto() {
    }
    
//Declarando Metodos:

    //Getters and Setters:
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCaja_manual() {
        return caja_manual;
    }

    public void setCaja_manual(boolean caja_manual) {
        this.caja_manual = caja_manual;
    }
    
    //toString:

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + 
                ", patente=" + patente + 
                ", cant_puertas=" + cant_puertas + 
                ", color=" + color + 
                ", caja_manual=" + caja_manual + '}';
    }
    
    //Metodos:
    
    public void encender () {
        System.out.println("Estoy encendiendo.");
    }
    
    public void apagar () {
        System.out.println("Estoy apagando.");
    }
    
    public void acelerar (double km) {
        System.out.println("Estoy acelerando " + km + "km.");
    }
    
    public void frenar (double km) {
        System.out.println("Estoy frenando " + km + "km.");
    }
}
