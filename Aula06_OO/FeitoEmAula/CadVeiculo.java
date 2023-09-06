public class CadVeiculo {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2++;
        System.out.println("Num1 = " + num1 + " - Num2 = " + num2);
        //Solicitei para o usuario e ele me passou os dados do veiculo
        System.out.println("Até o momento " + Veiculo.contador + 
                        " objetos da classe Veículo foram instanciados");
        Veiculo meuVeiculo = new Veiculo("Fiat", "Uno", 2005);
        Veiculo teuVeiculo = new Veiculo(2020);
        System.out.println("Até o momento " + Veiculo.contador + 
                        " objetos da classe Veículo foram instanciados");
        //meuVeiculo.marca = "Fiat";
        //meuVeiculo.modelo = "Uno de Firma com escada";
        //meuVeiculo.ano = 2005;
        meuVeiculo.ligar();
        //teuVeiculo.marca = "Volkswagem";
        teuVeiculo.setMarca("Volkswagem");
        meuVeiculo.setMarca("Fiat - F... isto agora é teu");
        System.out.println("A marca atual do teuVeiculo é : " + teuVeiculo.getMarca());
        //teuVeiculo.modelo = "Fusca do Itamar";
        teuVeiculo.setModelo("Fusca do Itamar");
        //teuVeiculo.ano = 1996;
        teuVeiculo.setAno(1996);
        teuVeiculo.ligar();

        Veiculo cloneMeuVeiculo = meuVeiculo.clonar();

        // Retorna a referência a um objeto do tipo Veiculo
        Veiculo cloneTeuVeiculo = teuVeiculo.clonarErrado();
        // Atribuição por Referência
        Veiculo outroVeiculo = teuVeiculo;
        //outroVeiculo.ano = 1994;
        outroVeiculo.setAno(1994);
        //teuVeiculo.ano = 1996;
        teuVeiculo.setAno(1996);

        int tempoMeuVeiculo = meuVeiculo.calculaTempoUso();
        int tempoTeuVeiculo = teuVeiculo.calculaTempoUso();
        int tempoOutroVeiculo = outroVeiculo.calculaTempoUso();

        int tempoMeuVeiculo2030 = meuVeiculo.calculaTempoUso(2030);
        int tempoTeuVeiculo2030 = teuVeiculo.calculaTempoUso(2030);
        int tempoOutroVeiculo2030 = outroVeiculo.calculaTempoUso(2030);

        //System.out.println("Marca: " + meuVeiculo.marca +
        //                    " - Modelo: " + meuVeiculo.modelo +
        //                    " - Ano: " + meuVeiculo.ano);
        System.out.println("Marca: " + meuVeiculo.getMarca() +
                            " - Modelo: " + meuVeiculo.getModelo() +
                            " - Ano: " + meuVeiculo.getAno());
        
    }
}
