public class MiniApp {
    public static void main(String[] args) {
        Produto.exemploMetodoStatic();
        Produto.exemploAtributoEstatico = 55;

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fulando de Tal");
        System.out.println(cliente1.toString());
    }
}
