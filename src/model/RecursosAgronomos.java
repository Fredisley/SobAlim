
package model;


public class RecursosAgronomos extends RecursosHumanos{
        private double tierrasVianda;
        private double tierrasHortalizas;
        private double tierrasFrutales;
        private double tierrasGrano;

    public RecursosAgronomos(double tierrasVianda, double tierrasHortalizas, double tierrasFrutales, double tierrasGrano, int id, int territorio_id, int trabajadores) {
        super(id, territorio_id, trabajadores);
        this.tierrasVianda = tierrasVianda;
        this.tierrasHortalizas = tierrasHortalizas;
        this.tierrasFrutales = tierrasFrutales;
        this.tierrasGrano = tierrasGrano;
    }
  
    public double getTierrasFrutales() {
        return tierrasFrutales;
    }

    public double getTierrasGrano() {
        return tierrasGrano;
    }

    public double getTierrasHortalizas() {
        return tierrasHortalizas;
    }

    public double getTierrasVianda() {
        return tierrasVianda;
    }

    public void setTierrasFrutales(double tierrasFrutales) {
        this.tierrasFrutales = tierrasFrutales;
    }

    public void setTierrasGrano(double tierrasGrano) {
        this.tierrasGrano = tierrasGrano;
    }

    public void setTierrasHortalizas(double tierrasHortalizas) {
        this.tierrasHortalizas = tierrasHortalizas;
    }

    public void setTierrasVianda(double tierrasVianda) {
        this.tierrasVianda = tierrasVianda;
    }
        
        
}
