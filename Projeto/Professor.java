
public class Professor extends Pessoa {
    protected int iD;
    Disciplina disciplina;

   
    //Construtor
    public Professor(String nome, String email, String cpf, Data data, int id, Disciplina disciplina) {
        super(nome, email, cpf, data);
        this.iD = id;
        this.disciplina = disciplina;
    }
    

    //get e set

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    
    public void adicionaNotaAluno(float nota, Aluno aluno) {
        disciplina.adicionaNota(nota);
    }

    //Métodos
   /*  public void admitirAtividade(String disciplina, float nota){
        for(int i=0; i<numDisciplinas; i++){
            if(disciplinas[i].equals(disciplina)){
                this.notas[i] += nota;
            }
        }
    }*/
}
