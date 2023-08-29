import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        try {
            Scanner lerTeclado = new Scanner(System.in);
            System.out.println("Digite seu nome completo:");
            String nome = lerTeclado.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = lerTeclado.nextInt();
            lerTeclado.nextLine();

            System.out.printf("""
                    Nome: %s
                    Idade: %d
                    """, nome, idade);
            lerTeclado.close();
        } catch (Exception err) {
            if (err instanceof InputMismatchException)
                System.out.println("Valor digitado inválido");
            else 
                System.out.println("Opssss! Houve um erro: " + err.getMessage());
        }

    }
}