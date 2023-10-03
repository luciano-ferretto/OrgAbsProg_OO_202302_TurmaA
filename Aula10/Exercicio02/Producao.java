public class Producao {
    

    public static void main(String[] args) {
        int previsaoDemanda = 200;
        int producaoNormal = 250;
        int estoqueInicial = 50;
        int estoqueFinal;
        
        estoqueFinal = (estoqueInicial +producaoNormal) - previsaoDemanda;
        System.out.println(estoqueFinal);
    }
}