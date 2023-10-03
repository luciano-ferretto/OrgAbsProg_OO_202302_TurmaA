public abstract class Animal  {
    private String nome;
    Animal(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    abstract String fazerSom();
    
}
