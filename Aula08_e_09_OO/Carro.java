public final class Carro extends Veiculo{
    private int numeroPortas;
 
    @Override
    public String toString() {
        String texto = super.toString();
        return texto + ", Num. Portas: " + this.getNumeroPortas();
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas){
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calculaConsumo() {
        // Aqui codifica o cálculo específico para objetos Carro
        return 8.0;
    }
}
