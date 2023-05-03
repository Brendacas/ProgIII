
package LP3.Projeto;
import java.util.Scanner;

public class Professor extends Pessoa {
    protected int iD;

    Scanner scan = new Scanner(System.in);


    //Construtor
    public Professor(String nome, String email, double cpf, Data data, int id){
        super(nome, email, cpf, data);
        this.iD = id;
    }

    //get e set

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
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
