public class Produto {
    public static int exemploAtributoEstatico = 33;//exemplo de atributo/variável de CLASSE
    private int codigo; // atributo/variável de INSTÂNCIA
    private String nome;
    private double preco;
    public static void exemploMetodoStatic() {
        System.out.println("exemplo de método estático");
    }

    @Override
    public String toString() {

        return  "Nome: " + this.nome + " - Código: " + this.codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
