public class Quadrado extends FormaGeometrica{

    @Override
    public double calcularArea() {
        //return this.getMedida1() * this.getMedida1();
        return Math.pow(getMedida1(), 2);
    }
    
}
