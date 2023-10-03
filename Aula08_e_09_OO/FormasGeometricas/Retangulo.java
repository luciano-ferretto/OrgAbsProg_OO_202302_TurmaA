public class Retangulo extends FormaGeometrica{
    private double medida2;
    public double getMedida2() {
        return medida2;
    }
    public void setMedida2(double medida2) {
        this.medida2 = medida2;
    }
    @Override
    public double calcularArea() {
        return this.getMedida1() * this.getMedida2();
    }
}
