public class ExemploMetodo {
    static void imprimeOi() { //"void" significa que o método NÃO terá retorno
        System.out.println("OI");
    }
    static int soma(int a, int b) {//os parâmetros de entrada devem ser tipados
        return a + b;
    }
    static double soma(double a, double b) { 
        return a + b;
    }
    static String soma(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        imprimeOi();

        int resultadoInt = soma(2, 3);
        System.out.println(resultadoInt);

        double resultadoDouble = soma(2.5, 3.5);
        System.out.println(resultadoDouble);

        String result = soma("a", "b");
    }
}
