public class ExemploFinalMetodo {
    public final void metodoFinal() {
        System.out.println("Este método é final e não pode ser sobrescrito.");
    }
}
class subClasse extends ExemploFinalMetodo {
    //Essa sobrescrita gera um erro, pois o método da
    //super classe é final
    @Override
    public void metodoFinal() {
        System.out.println("Erro ao sobrescrever o método");
    }
}

