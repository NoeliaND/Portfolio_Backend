package com.mycompany.ejemplopoo;

//Clase Hija de Vehiculo.

public class Camion extends Vehiculo {
    
    int cant_ejes;
    boolean acoplado;

    public Camion(int cant_ejes, boolean acoplado, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }
    
}
