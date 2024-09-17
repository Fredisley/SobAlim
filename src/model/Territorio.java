package model;

import java.util.Objects;

public class Territorio {

    private int id;
    private String nombre;
    private int poblacion;
    private double extencionGeografica;
    private double tierrasProductivas;
    private String fecha;

    public Territorio(String nombre, int poblacion, double extencionGeografica, double tierrasProductivas, String fecha) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extencionGeografica = extencionGeografica;
        this.tierrasProductivas = tierrasProductivas;
        this.fecha = fecha;
    }
    
    public Territorio(int id, String nombre, int poblacion, double extencionGeografica, double tierrasProductivas, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extencionGeografica = extencionGeografica;
        this.tierrasProductivas = tierrasProductivas;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getExtencionGeografica() {
        return extencionGeografica;
    }

    public void setExtencionGeografica(double extencionGeografica) {
        this.extencionGeografica = extencionGeografica;
    }

    public double getTierrasProductivas() {
        return tierrasProductivas;
    }

    public void setTierrasProductivas(double tierrasProductivas) {
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
        return Objects.hash(getId(), getNombre(), getPoblacion(), getExtencionGeografica() ,getTierrasProductivas(), getFecha());
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString() {
        return this.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

}
