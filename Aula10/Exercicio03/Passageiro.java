public class Passageiro extends Veiculo{
    private int numeroPassageiros;

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public double calculaMedia() {
        return 0;
    }
}
