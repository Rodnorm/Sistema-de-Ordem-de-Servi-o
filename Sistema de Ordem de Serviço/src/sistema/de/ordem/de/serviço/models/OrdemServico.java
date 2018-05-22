
package sistema.de.ordem.de.serviço.models;

import java.util.Date;


public class OrdemServico {

    public int getNumeroOrderServico() {
        return numeroOrderServico;
    }

    public void setNumeroOrderServico(int numeroOrderServico) {
        this.numeroOrderServico = numeroOrderServico;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private int numeroOrderServico;
    private Date dataInicial;
    private Date dataConclusao;
    private double valor;
    private String descricao;
    
    
}
