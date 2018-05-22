
package sistema.de.ordem.de.serviço.models;

import java.util.Date;


public class Cliente extends Pessoa{
    public Cliente(String nome, String telefone, String CPF, String dtNascimento){
        super(nome, telefone, CPF, dtNascimento);
    }
    
    private String nContrato;
    private Date dataCadastro;
    
    public String getnContrato() {
        return nContrato;
    }

    public void setnContrato(String nContrato) {
        this.nContrato = nContrato;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
  
}
