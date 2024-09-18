package model;

public class RecursosHumanos {
    private int id;
    private int territorioId; 
    private int trabajadores;

    public RecursosHumanos(int id, int territorioId, int trabajadores) {
        this.id = id;
        this.territorioId = territorioId;
        this.trabajadores = trabajadores;
    }
    
    public RecursosHumanos(int id, int territorioId){
        this.id = id;
        this.territorioId = territorioId;
    }

    public int getTerritorioId() {
        return territorioId;
    }

    public void setTerritorioId(int territorioId) {
        this.territorioId = territorioId;
    }
    
    
    public int getId() {
        return id;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setId(int id) {
        this.id = id;
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
