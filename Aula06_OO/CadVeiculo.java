public class CadVeiculo {
    public static void main(String[] args) {

        // Invocando um método Estático, ou seja, não há a necessidade
        // de instanciar um objeto a partir da classe Calculadora
        int resultadoSomaInteiro = Calculadora.somarInteiros(2, 2);
        // Instanciando um novo Objeto apartir da classe Veiculo
        // passando parâmetros no método construtor
        Veiculo veiculoTeste = new Veiculo("Ford", "Fusion", 2020);

        // Instanciando um novo veículo e alterando seus atributos
        Veiculo meuVeiculo = new Veiculo();
        meuVeiculo.setMarca("Fiat");
        meuVeiculo.setModelo("Uno");
        meuVeiculo.setAno(2003);
        meuVeiculo.ligar(); // Invocando o método ligar()

        // Exemplo de atribuição por refência - As duas variáveis apontam para o mesmo objeto
        Veiculo outroUno = meuVeiculo;
        outroUno.setAno(2010);
        System.out.println("O ano do meu veículo é " + meuVeiculo.getAno());
        System.out.println("O ano do outro uno é " + outroUno.getAno());

        // Instanciando um segundo veículo
        Veiculo teuVeiculo = new Veiculo();
        teuVeiculo.setMarca("Volkswagen");
        teuVeiculo.setModelo("Fusca do Itamar");
        teuVeiculo.setAno(1995);

        int anoAtual = 2023;
        int tempoUso = teuVeiculo.calculaTempoUso(anoAtual);
        System.out.println("O tempo de uso desse carro é "
                + tempoUso + " anos.");
        System.out.println("O tempo de uso desse carro é "
                + teuVeiculo.calculaTempoUso(2023) + " anos.");
        // Exemplo para criar uma cópia do objeto através do método específico para isso
        Veiculo novoVeiculo = teuVeiculo.criarCopiaAPartirDeOutro(teuVeiculo);

    }
}
