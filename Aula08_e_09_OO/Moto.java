public class Moto extends Veiculo{
    private boolean partidaEletrica;


    @Override
    public String toString() {
        String partida = this.getPartidaEletrica() ? "SIM" : "NÃO";
        String texto = super.toString();
        return texto + ", Partida Elétrica: " + partida;
    }

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica){
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public double calculaConsumo() {
        // Aqui codifica o cálculo específico para objetos Moto
        return 20.0;
    }
}
