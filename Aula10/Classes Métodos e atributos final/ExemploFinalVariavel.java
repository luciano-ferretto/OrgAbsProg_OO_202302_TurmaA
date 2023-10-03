public class ExemploFinalVariavel {
    public static void main(String[] args) {
        final int constante = 10;
        constante = 20; // Isso gera um erro, pois a variável é final
        System.out.println(constante);
    }
}

