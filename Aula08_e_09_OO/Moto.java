public class Moto extends Veiculo{
    private boolean partidaEletrica;


    @Override
    public String toString() {
        String partida = this.getPartidaEletrica() ? "SIM" : "NÃO";
        String texto = super.toString();
        return texto + " - Partida Eletrica: " + partida;
    }

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
}
