import java.time.LocalDate;

public class Veiculo {
    public static int contador = 0;
    static {
        System.out.println("Bloco Estático executado");
        contador = 0;
    }

    private String marca;
    private String modelo;
    private int ano;
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
        this("MARCA NÃO DEFINIDA");
    }
    
    public Veiculo( String marca) {
        this(marca, "MODELO NÃO DEFINIDO");
    }
    public Veiculo( String marca, String modelo) {
        this(marca, modelo, -1);
    }
    public Veiculo(int ano) {
        this("MARCA","MODELO",ano);
        //this.ano = ano;
    }
    public Veiculo(String marca, String modelo, int ano) {
        System.out.println("Método construtor executado");
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        Veiculo.contador++;
    }



    public  Veiculo clonar() {
        Veiculo veiculo = new Veiculo();
        veiculo.marca = this.marca;
        veiculo.modelo = this.modelo;
        veiculo.ano = this.ano;
        return veiculo;
    }

    public Veiculo clonarErrado() {
        return this;
    }

    public int calculaTempoUso() {
        int anoBase  = LocalDate.now().getYear();
        int tempo = this.calculaTempoUso(anoBase);
        return tempo;
    }
    public int calculaTempoUso(int anoBase) {
        int tempo = anoBase - this.ano;
        return tempo;
        //System.out.println("Tempo de uso: " + tempo + " ano(s)");
    }

    public void ligar() {
        System.out.println("Veículo " + this.modelo + " ligado!");
    }
}