/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaVeterinaria;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Mascota {

    private String nombre;
    private String especie;
    private int edad; 
    private Historial his;
    
    public Mascota(String nombre, String especie, int edad) {
        setEdad(edad);
        setEspecie(especie);
        setNombre(nombre);
        this.his = new Historial();
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException(" Nombre invalido.");
        }
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()){
            throw new IllegalArgumentException(" Especie invalida.");
        }
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0){
            throw new IllegalArgumentException("Edad no valida.");
        }
        this.edad = edad;
    }


    
    public void agregarConsulta(Consulta c){
     his.agregarConsulta(c);
    }
    public void mostrarHistorial() {
        System.out.println("Mascota:" + nombre + " | " + "Especie: "+ especie + " | " + "Edad: " + edad);
        
//        for (Consulta c : consultas){
//        c.mostrarDetallesConsulta();
   
        his.mostrarConsultas();
        }

    }

