
package model;


public class Producto {
    private Integer id;
    private Territorio territorio;
    private String nombre;
    private String tipo;
    private float tierrasProductivas;

    public Producto(Territorio territorio, String nombre, String tipo, float tierrasProductivas) {
        this.territorio = territorio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tierrasProductivas = tierrasProductivas;
    }

    public Territorio getTerritorio() {
        return territorio;
    }

    public void setTerritorio(Territorio territorio) {
        this.territorio = territorio;
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

    public float getTierrasProductivas() {
        return tierrasProductivas;
    }

    public void setTierrasProductivas(float tierrasProductivas) {
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
