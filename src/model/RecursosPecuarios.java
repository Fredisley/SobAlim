
package model;


public class RecursosPecuarios extends RecursosHumanos {
    
    private float espejoAgua;
    private int granjaVacuno;
    private int granjaAvicola;
    private int granjaOvino;
    private int granjaPorcino;

    public RecursosPecuarios(float espejoAgua, int granjaVacuno, int granjaAvicola, int granjaOvino, int granjaPorcino, int ID, Territorio territorio, int trabajadores) {
        super(ID, territorio, trabajadores);
        this.espejoAgua = espejoAgua;
        this.granjaVacuno = granjaVacuno;
        this.granjaAvicola = granjaAvicola;
        this.granjaOvino = granjaOvino;
        this.granjaPorcino = granjaPorcino;
    }

    public float getEspejoAgua() {
        return espejoAgua;
    }

    public int getGranjaAvicola() {
        return granjaAvicola;
    }

    public int getGranjaOvino() {
        return granjaOvino;
    }

    public int getGranjaPorcino() {
        return granjaPorcino;
    }

    public int getGranjaVacuno() {
        return granjaVacuno;
    }

    public void setEspejoAgua(float espejoAgua) {
        this.espejoAgua = espejoAgua;
    }

    public void setGranjaAvicola(int granjaAvicola) {
        this.granjaAvicola = granjaAvicola;
    }

    public void setGranjaOvino(int granjaOvino) {
        this.granjaOvino = granjaOvino;
    }

    public void setGranjaPorcino(int granjaPorcino) {
        this.granjaPorcino = granjaPorcino;
    }

    public void setGranjaVacuno(int granjaVacuno) {
        this.granjaVacuno = granjaVacuno;
    }
    
}
