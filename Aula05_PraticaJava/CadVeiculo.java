public class CadVeiculo {
    public static void main(String[] args) {
        imprimirMenu();
    }
    private static void limparTela(){
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
                """;
        System.out.println(menu);
    }
}