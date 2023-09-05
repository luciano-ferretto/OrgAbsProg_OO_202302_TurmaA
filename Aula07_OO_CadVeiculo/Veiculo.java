import java.time.LocalDate;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    public Veiculo() {

    }
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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
    
    public int calcularIdade() {
        return calcularIdade(LocalDate.now().getYear());
    }
    public int calcularIdade(int anoBase) {
        int idade = anoBase - this.ano;
        return idade;
    }

    public boolean verificaIPVA() {
        return calcularIdade() <= 20;
    }
}
