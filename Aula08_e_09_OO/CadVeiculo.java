import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CadVeiculo {
    static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        do { // Loop para permanecer no programa até o usuário escolher a opção 0 (zero)
            while (true) { // Loop para quando o usuário digitar valor NÃO inteiro
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
                    cadastrar(scan);
                    break;
                case 2:
                    remover(scan);
                    break;
                case 3:
                    listar();
                    System.out.println("Pressione Enter para continuar");
                    scan.nextLine();
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

    private static void cadastrar(Scanner scan) {
        limparTela();
        System.out.println("Qual tipo de Veículo?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        int opcao = scan.nextInt();
        scan.nextLine(); 
        String tipoVeiculo = opcao == 1 ? "do Carro" : "da Moto";

        System.out.println("Digite a marca " + tipoVeiculo + ": ");
        String marca = scan.nextLine();
        System.out.println("Digite o modelo " + tipoVeiculo + ": ");
        String modelo = scan.nextLine();
        System.out.println("Digite o ano " + tipoVeiculo + ":");
        int ano;
        while (true) {
            try {
                ano = scan.nextInt();
                scan.nextLine();
                break;
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Formato inválido");
            }
        }
        Veiculo veiculoAdd;
        if (opcao == 1) {
            System.out.println("Digite o número de portas: ");
            int nportas = scan.nextInt();
            veiculoAdd = new Carro(marca, modelo, ano, nportas);
        } else {
            System.out.println("A Moto possui partida elétrica (1-Sim / 2-Não)");
            boolean partida = scan.nextInt() == 1 ? true : false;
            veiculoAdd = new Moto(marca, modelo, ano, partida);
        }
        
        veiculos.add(veiculoAdd);
        System.out.println("Veículo cadastrado com sucesso! - Pressione enter para continuar");
        scan.nextLine();
    }

    private static void listar() {
        limparTela();
        System.out.println("Veículos cadastrados");
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo vei = veiculos.get(i);
            System.out.println((i + 1)
                    + " - Marca: " + vei.getMarca()
                    + " - Modelo: " + vei.getModelo()
                    + " - Ano: " + vei.getAno());
            System.out.println(" --- Idade: " + vei.calculaTempoUso());
            String pagaIPVA = vei.verificaIPVA() ? "Sim" : "Não";
            System.out.println(" --- Paga IPVA: " + pagaIPVA);
        }
    }

    private static void remover(Scanner scan) {
        listar();
        System.out.println("Qual veículo você quer remover");
        System.out.println("0 > Cancelar");
        int indiceRemover;
        while (true) {
            try {
                indiceRemover = scan.nextInt();
                scan.nextLine();
                if (indiceRemover >= 0 && indiceRemover <= veiculos.size())
                    break;
                else
                    System.out.println("Índice fora do intervalo existente. Digite novamente:");
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Digite um índice válido");
            }
        }
        if (indiceRemover > 0) {
            veiculos.remove(indiceRemover - 1);
            System.out.println("Veículo removido com sucesso! - Pressione enter para continuar");
            scan.nextLine();
        }
    }
}
