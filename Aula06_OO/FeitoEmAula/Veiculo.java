public class Veiculo {
    String marca;
    String modelo;
    int ano;
    int calculaTempoUso() {
        int tempo = 2023 - this.ano;
        return tempo;
        //System.out.println("Tempo de uso: " + tempo + " ano(s)");
    }
    void ligar() {
        System.out.println("Veículo " + this.modelo + " ligado!");
    }
}