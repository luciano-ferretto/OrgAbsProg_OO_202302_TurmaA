import java.time.LocalDate;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    Veiculo() {
        this("MARCA NÃO DEFINIDA");
    }
    
    Veiculo( String marca) {
        this(marca, "MODELO NÃO DEFINIDO");
    }
    Veiculo( String marca, String modelo) {
        this(marca, modelo, -1);
    }
    Veiculo(int ano) {
        //this("MARCA","MODELO",ano);
        this.ano = ano;
    }
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }



    Veiculo clonar() {
        Veiculo veiculo = new Veiculo();
        veiculo.marca = this.marca;
        veiculo.modelo = this.modelo;
        veiculo.ano = this.ano;
        return veiculo;
    }

    Veiculo clonarErrado() {
        return this;
    }

    int calculaTempoUso() {
        int anoBase  = LocalDate.now().getYear();
        int tempo = this.calculaTempoUso(anoBase);
        return tempo;
    }
    int calculaTempoUso(int anoBase) {
        int tempo = anoBase - this.ano;
        return tempo;
        //System.out.println("Tempo de uso: " + tempo + " ano(s)");
    }

    void ligar() {
        System.out.println("Veículo " + this.modelo + " ligado!");
    }
}