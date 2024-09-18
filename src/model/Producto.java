 
package model;


public class Producto {
    private int id;
    private int territorio_id;
    private String nombre;
    private String tipo;
    private double tierrasProductivas;

    public Producto(int territorio_id, String nombre, String tipo, double tierrasProductivas) {
        this.territorio_id = territorio_id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tierrasProductivas = tierrasProductivas;
    }

    public Producto(int id, int territorio_id, String nombre, String tipo, double tierrasProductivas) {
        this.id = id;
        this.territorio_id = territorio_id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tierrasProductivas = tierrasProductivas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTerritorio_id() {
        return territorio_id;
    }

    public void setTerritorio_id(int territorio_id) {
        this.territorio_id = territorio_id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTierrasProductivas() {
        return tierrasProductivas;
    }

    public void setTierrasProductivas(double tierrasProductivas) {
        this.tierrasProductivas = tierrasProductivas;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
