public class CadVeiculo {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2++;
        System.out.println("Num1 = " + num1 + " - Num2 = " + num2);
        //Solicitei para o usuario e ele me passou os dados do veiculo
        Veiculo meuVeiculo = new Veiculo();
        Veiculo teuVeiculo = new Veiculo();
        meuVeiculo.marca = "Fiat";
        meuVeiculo.modelo = "Uno de Firma com escada";
        meuVeiculo.ano = 2005;
        meuVeiculo.ligar();
        teuVeiculo.marca = "Volkswagem";
        teuVeiculo.modelo = "Fusca do Itamar";
        teuVeiculo.ano = 1996;
        teuVeiculo.ligar();

        Veiculo outroVeiculo = teuVeiculo;
        outroVeiculo.ano = 1994;

        teuVeiculo.ano = 1996;

        int tempoMeuVeiculo = meuVeiculo.calculaTempoUso();
        int tempoTeuVeiculo = teuVeiculo.calculaTempoUso();
        int tempoOutroVeiculo = outroVeiculo.calculaTempoUso();

        System.out.println("Marca: " + meuVeiculo.marca +
                            " - Modelo: " + meuVeiculo.modelo +
                            " - Ano: " + meuVeiculo.ano);
        
    }
}
