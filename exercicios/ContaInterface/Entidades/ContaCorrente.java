package ContaInterface.Entidades;
import ContaInterface.Interface.*;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(){}
    public ContaCorrente(double saldoConta, double limite, int agenciaConta, int numConta, int senha, String titularConta, String cpf) {
        super(saldoConta, agenciaConta, numConta, senha, titularConta, cpf);
        this.setLimite(limite);
    }

    public double getLimite() {return limite;}
    public void setLimite(double limite) {this.limite = limite;}

    public double tributacao(){
        Tributacao<Double> tributo = valor -> valor * 0.02;
        return tributo.calcularImposto(getSaldoConta() + getLimite());
    }

    private void taxaConta(){
        setSaldoConta(getSaldoConta() - tributacao());
    }

    @Override
    public String sacar(double saqueValor) {
        if(saqueValor <= getSaldoConta()) {
            setSaldoConta(getSaldoConta() - (saqueValor + 5));
            return  "--------------------------------------------------------------------------\n" +
                    "SAQUE CONCLUIDO COM SUCESSO" +
                    "\n--------------------------------------------------------------------------";
        }else if(saqueValor <= getSaldoConta() + limite){
            saqueValor = getSaldoConta() - saqueValor;
            setSaldoConta(0);
            setLimite(getLimite() - (saqueValor + 5));
            return  "--------------------------------------------------------------------------\n" +
                    "SAQUE CONCLUIDO COM SUCESSO" +
                    "\n--------------------------------------------------------------------------";
        }
        return "--------------------------------------------------------------------------\n" +
                "VALOR INDISPONIVEL" +
                "\n--------------------------------------------------------------------------";
    }

    public String toString() {
        return  "TITULAR: "+getTitularConta()+
                "\nCPF: "+getCpf()+
                "\nAGENCIA: "+getAgenciaConta()+
                "\nCONTA: "+getNumConta()+
                "\nSALDO: R$"+getSaldoConta()+
                "\nLIMITE: R$"+limite+
                "\nIMPOSTO: R$"+tributacao();
    }
}
