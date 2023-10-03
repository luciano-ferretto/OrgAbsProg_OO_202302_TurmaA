public abstract class FormaGeometrica {
    private String cor;
    private double medida1;
    
    public abstract double calcularArea();

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getMedida1() {
        return medida1;
    }
    public void setMedida1(double medida1) {
        this.medida1 = medida1;
    }
    
}