
package sistema.de.ordem.de.serviço.models;


public class Funcionario extends Pessoa {
    public Funcionario (String nome, String telefone, String CPF, String dtNascimento){
    super(nome, telefone, CPF, dtNascimento);
    }
    
    private String especialidade;
    private int matricula;
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
