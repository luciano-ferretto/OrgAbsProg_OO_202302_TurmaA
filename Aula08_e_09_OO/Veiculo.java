import java.time.LocalDate;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    @Override
    public String toString() {
        return "Marca: " + this.getMarca()
                + ", Modelo: " + this.getModelo()
                + ", Ano: " + this.getAno();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo() {
        
    }
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int calculaTempoUso() {
        int anoBase  = LocalDate.now().getYear();
        int tempo = this.calculaTempoUso(anoBase);
        return tempo;
    }
    public int calculaTempoUso(int anoBase) {
        int tempo = anoBase - this.ano;
        return tempo;
    }
}