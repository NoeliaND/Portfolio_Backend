package com.mycompany.ejemplopoo;

public class EjemploPOO {

    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo(567, 4, "Nuevo", "Gold");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "NOE123", 5, "Azul", true, 1000, 4, "Volkswagen", "GolTren");
        Moto moto1 = new Moto(125, 2, "Yamaha", "ZR200");
        Camion camion1 = new Camion(6, true, 699/50, 6, "Mercedes", "Un Modelo");
        
        Vehiculo vector[] = new Vehiculo[4];
        vector[0] = vehiculo1;
        vector[1] = auto2;
        vector[2] = moto1;
        vector[3] = camion1;
        
        for (int i=0; i<4; i++) {
        
        System.out.println("Registro N° " + i + " " + vector[i].getMarca());
        
        }
        
        /*System.out.println(auto2.toString());
        System.out.println(auto1.toString());*/
        
        
        /*auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(30);
        auto2.apagar();*/
        
        /*System.out.println("El valor de la id es: " + auto2.getId());
        auto2.setId(35000);
        System.out.println("El nuevo valor de la id es: " + auto2.getId());*/
        
        /*System.out.println("La id de auto1 es: " + auto1.getId());
        System.out.println("El color de auto1 es: " + auto1.getColor());
        
        auto1.setCaja_manual(false);
        auto1.setCant_puertas(3);
        auto1.setColor("Amarillo");
        auto1.setId(1500);
        auto1.setPatente("ABC");
        
        System.out.println("--------");
        System.out.println("La nueva id de auto1 es: " + auto1.getId());
        System.out.println("El nuevo color de auto1 es: " + auto1.getColor());*/
    }
}
