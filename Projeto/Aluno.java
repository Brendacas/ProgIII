package LP3.Projeto;
public class Aluno extends Pessoa{
    protected int matricula;
    //protected Disciplina disciplina;


    public Aluno (String nome, String email, int cpf, int matricula, String endereco,int dia, int mes, int ano){
        super(nome, email, cpf, endereco, dia, mes, ano);
        this.matricula = matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public int getMatricula (){
        return matricula;
    }
  

    public void adicionarAtividade(String disciplina, String atividade) {
    }

  


}
