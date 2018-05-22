
package sistema.de.ordem.de.serviço.models;


public class Pessoa {
    public String nome;
    public String dtNascimento;
    public String cpf;
    public String telefone;
   
    public Pessoa(String nome, String dtNascimento, String cpf, String telefone){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

  
    public void setNome(String Nome) {
        this.nome = Nome;
    }

   
    public String getDtNascimento() {
        return dtNascimento;
    }

  
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

   
    public String getCPF() {
        return cpf;
    }

   
    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
