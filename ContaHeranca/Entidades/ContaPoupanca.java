package ContaHeranca.Entidades;

public class ContaPoupanca extends Conta {
    private final double rendimento = 12;

    public ContaPoupanca(int agenciaConta, int numConta, String titularConta){
        super(agenciaConta, numConta, titularConta);
    }

    private void calculaRendimento(){
        setSaldoConta(getSaldoConta() + (getSaldoConta()*(rendimento/100)));
    }

    @Override
    public String depositar(double depositoValor) {
        setSaldoConta(getSaldoConta() + depositoValor);
        calculaRendimento();
        return "-------------------------------------\n" +
                "DEPOSITO CONCLUIDO COM SUCESSO" +
                "\n-------------------------------------";
    }

    public String toString() {
        return  "TITULAR: "+getTitularConta()+
                "\nAGENCIA: "+getAgenciaConta()+
                "\nCONTA: "+getNumConta()+
                "\nSALDO: R$"+getSaldoConta()+
                "\nRENDIMENTO APLICADO: "+rendimento+"%";
    }
}