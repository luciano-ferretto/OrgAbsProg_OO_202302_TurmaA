public interface NotaFiscalEletronica {

    void gerarXML();

    void comunicaSefaz();

    void gerarDanfe();

    void enviarEmail();
}