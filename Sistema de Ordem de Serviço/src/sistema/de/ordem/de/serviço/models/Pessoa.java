
package sistema.de.ordem.de.serviço.models;


public class Pessoa {
    public String nome;
    public String dtNascimento;
    public int cpf;
    public String telefone;
   
    public Pessoa(String nome, String dtNascimento, int cpf, String telefone){
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

   
    public int getCPF() {
        return cpf;
    }

   
    public void setCPF(int CPF) {
        this.cpf = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
