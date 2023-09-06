public class Carro extends Veiculo{
    private int numeroPortas;
 
    @Override
    public String toString() {
        String texto = super.toString();
        return texto + ", Num. Portas: " + this.getNumeroPortas();
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
