import java.util.Arrays;
import java.util.List;

public class CadVeiculo {
    public static void metodoRecebeQualquerTipo(Object objeto) {

    }

    public static void imprimirVeiculo(List<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
            System.out.print("Tempo de uso: ");
            System.out.println(veiculo.calculaTempoUso());
            if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                System.out.println(carro.getNumeroPortas());
            }            
        }
    }

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Kia","Cerato",2011,4);
        Carro teuCarro = new Carro("Ford","Fusion",2020,4);
        Moto minhaMoto = new Moto("Honda","Falcon",2012,true);
        Moto tuaMoto = new Moto("Honda","Titan 150", 2010, false);
        List<Veiculo> veiculosDiv = Arrays.asList(meuCarro, teuCarro, minhaMoto, tuaMoto);
        imprimirVeiculo(veiculosDiv);

        Object carroObjeto = meuCarro;
        Object motoObjeto = minhaMoto;
        Object veiculoObjeto = new Veiculo();



        Veiculo meuVeiculo = meuCarro;
        meuCarro.setMarca("Kia");
        meuVeiculo.setMarca("KIA");
        meuCarro.setNumeroPortas(4);
        // meuVeiculo.setNumeroPortas(4);

        Veiculo veiculoQualquer = new Veiculo();
        //Carro carro01 = new Carro();
        //Moto moto01 = new Moto();
        //carro01.calculaTempoUso();

        double numeroDouble = 3;
        int numeroInt = (int) numeroDouble;

    }
}
