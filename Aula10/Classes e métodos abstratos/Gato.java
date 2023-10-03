public class Gato extends Animal{
    Gato(String nome) {
        super(nome);
    }
    @Override
    String fazerSom() {
        return "Miauuuu!";
    }
}
