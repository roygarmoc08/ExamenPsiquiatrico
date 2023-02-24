/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.asti.examenpsicometrico.Data;

/**
 *
 * @author GAMR_
 */
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private String puesto;
    private String folio;
    private String fecha;
    
    private double calificacion;

    public Alumno(String nombre, String apellidos,
                  String puesto, String folio, String fecha)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.folio = folio;
        this.fecha = fecha;
    }
    
    public Alumno(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
    
    
}
