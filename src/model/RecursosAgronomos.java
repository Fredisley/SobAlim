
package model;


public class RecursosAgronomos extends RecursosHumanos{
        private float tierrasVianda;
        private float tierrasHortalizas;
        private float tierrasFrutales;
        private float tierrasGrano;

    public RecursosAgronomos(float tierrasVianda, float tierrasHortalizas, float tierrasFrutales, float tierrasGrano, int ID, Territorio territorio, int trabajadores) {
        super(ID, territorio, trabajadores);
        this.tierrasVianda = tierrasVianda;
        this.tierrasHortalizas = tierrasHortalizas;
        this.tierrasFrutales = tierrasFrutales;
        this.tierrasGrano = tierrasGrano;
    }

    public float getTierrasFrutales() {
        return tierrasFrutales;
    }

    public float getTierrasGrano() {
        return tierrasGrano;
    }

    public float getTierrasHortalizas() {
        return tierrasHortalizas;
    }

    public float getTierrasVianda() {
        return tierrasVianda;
    }

    public void setTierrasFrutales(float tierrasFrutales) {
        this.tierrasFrutales = tierrasFrutales;
    }

    public void setTierrasGrano(float tierrasGrano) {
        this.tierrasGrano = tierrasGrano;
    }

    public void setTierrasHortalizas(float tierrasHortalizas) {
        this.tierrasHortalizas = tierrasHortalizas;
    }

    public void setTierrasVianda(float tierrasVianda) {
        this.tierrasVianda = tierrasVianda;
    }
        
        
}
