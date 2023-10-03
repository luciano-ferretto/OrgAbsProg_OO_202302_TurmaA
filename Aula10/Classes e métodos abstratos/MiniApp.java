import java.util.Arrays;
import java.util.List;

public class MiniApp {
    public static void main(String[] args) {
        Cachorro myDog1 = new Cachorro("SCOOBY");
        Cachorro myDog2 = new Cachorro("TOTÓ");
        Gato myCat1 = new Gato("MIMI");
        Gato myCat2 = new Gato("TIGRINHO");
        Animal teste = myCat2; // UpCasting - Cast implícito
        MiniApp.imprimirSons(Arrays.asList(myDog1, myCat1, myDog2, myCat2));
        imprimirMaiusculo(Arrays.asList(myDog1, myCat1, myDog2, myCat2));
    }

    private static void imprimirMaiusculo(List<Object> lista) {
        for (Object objeto : lista) {
            System.out.println(objeto.toString().toUpperCase());
            if (objeto instanceof Animal) {
                Animal animal = (Animal) objeto;
                animal.fazerSom();
            }
        }
    }

    private static void imprimirSons(List<Animal> listaAnimais) {
        for (Animal animal : listaAnimais) {

            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                cachorro.daAPata();
            }
            String som = animal.fazerSom();
            String nome = animal.getNome();
            System.out.println("O animalzinho " + nome + " faz " + som);
        }
    }
}
