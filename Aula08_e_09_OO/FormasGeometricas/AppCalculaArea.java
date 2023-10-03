import java.util.Scanner;

public class AppCalculaArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a forma geométrica que você deseja calcular a área");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        int opcao = scan.nextInt();
        scan.nextLine();
        System.out.println("Qual a cor da forma: ");
        String cor = scan.nextLine();
        System.out.println("Qual a medida 01:");
        double medida1 = scan.nextDouble();
        scan.nextLine();
        FormaGeometrica forma = null;
        if (opcao == 1) {
            forma = new Quadrado();
        } else if (opcao == 2) {
            forma = new Retangulo();
            System.out.println("Qual a medida 02:");
            double medida2 = scan.nextDouble();
            scan.nextLine();
            Retangulo ret = (Retangulo) forma;
            ret.setMedida2(medida2);
            //((Retangulo) forma).setMedida2(medida2); //outra maneira
        }
        if (forma != null) {
            forma.setCor(cor);
            forma.setMedida1(medida1);
            System.out.println("A área é: " + forma.calcularArea());
        } else
            System.out.println("Opção inválida");
    }
}
