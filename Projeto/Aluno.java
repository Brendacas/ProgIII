
public class Aluno extends Pessoa{
    protected int matricula;
    protected Disciplina disciplina;
  


    public Aluno (String nome, String email, String cpf, int matricula, Data data){
        super(nome, email, cpf, data);
        this.matricula = matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public int getMatricula (){
        return matricula;
    }
  

    public void calcularMedia() {
        float[] notas = disciplina.getNotas();
        int creditos = disciplina.getCredito();
        disciplina.calcularMedia(notas, creditos);
    }
}

  



