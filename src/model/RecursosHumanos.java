package model;

public class RecursosHumanos {
    private int ID;
    private Territorio territorio; 
    private int trabajadores;

    public RecursosHumanos(int ID, Territorio territorio, int trabajadores) {
        this.ID = ID;
        this.territorio = territorio;
        this.trabajadores = trabajadores;
    }

    public int getID() {
        return ID;
    }

    public Territorio getTerritorio() {
        return territorio;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTerritorio(Territorio territorio) {
        this.territorio = territorio;
    }

    public void setTrabajadores(int trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
