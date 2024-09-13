/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fredy
 */
public class Territirio {
    private String nombre;
    private int poblacion;
    private float extencionGeografica;
    private float tierrasProductivas;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public float getExtencionGeografica() {
        return extencionGeografica;
    }

    public void setExtencionGeografica(float extencionGeografica) {
        this.extencionGeografica = extencionGeografica;
    }

    public float getTierrasProductivas() {
        return tierrasProductivas;
    }

    public void setTierrasProductivas(float tierrasProductivas) {
        this.tierrasProductivas = tierrasProductivas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
