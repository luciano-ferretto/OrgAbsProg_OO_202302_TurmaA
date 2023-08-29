import java.util.Scanner;

public class CadVeiculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        do { // Loop para permanecer no programa até o usuário escolher a opção 0 (zero)
            while (true) { //Loop para quando o usuário digitar valor NÃO inteiro
                try {
                    imprimirMenu();
                    opcao = scan.nextInt();
                    scan.nextLine();
                    break;
                } catch (Exception e) {
                    scan.nextLine();
                    System.out.println("A Opção deve ser NUMÉRICA - Pressione Enter para continuar");
                    scan.nextLine();
                }
            }
            switch (opcao) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Até logo!!!");
                    break;
                default:
                    System.out.println("Opção Inválida - Pressione Enter para continuar");
                    scan.nextLine();
                    break;
            }
        } while (opcao != 0);
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
    }

    private static void imprimirMenu() {
        limparTela();
        String menu = """
                ===== Cadastro de Veículos =====
                OPÇÕES:
                1 - Cadastrar novo veículo
                2 - Remover veículo
                3 - Listar veículos
                0 - Sair
                Digite a opção que deseja:
                """;
        System.out.println(menu);
    }
}