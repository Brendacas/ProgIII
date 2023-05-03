
abstract class Disciplina extends Professor{
    protected String nomeDisciplina, codigoDisciplina;
    protected float[] notas;
    protected int cargaHoraria, creditos = 0;
    private static boolean status = false;
    private static int cont = 0;
    
    // construtor
    public Disciplina(String nome, String email, double cpf, Data data, int id, String nomeDisciplina, String codigoDisciplina,  int creditos,
    int cargaHoraria) {
        super(nome, email,cpf,data,id);
    
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.cargaHoraria = cargaHoraria;
        if(verificarCreditos())
            this.creditos = creditos;
    }

    // getter's
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public int getCredito(){
        return creditos;
    }

    // setter's
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }


    //Métodos
    private boolean verificarCreditos() {
        if (creditos > 0) return true;
        else return false;
    }

    public void adicionaNota (float nota){
        if(cont <= creditos) notas[cont++] = nota;
    }

    private boolean calcularMedia(float[] notas, int creditos) {
        float somaNotas = 0;
        int somaCreditos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * creditos;
            somaCreditos += creditos;
        }
        float media = somaNotas / somaCreditos;
        if(media >= 7.0f){
            System.out.println("sua nota eh: "+ media + ",APROVADO");
            return true;
        }else{
            System.out.println("sua nota eh: "+ media + ",REPROVADO");
        }
    }
  

    public String toString (){
        return "Cod: " + codigoDisciplina + " Disciplina " + nomeDisciplina + " C/Horaria: " + cargaHoraria +
        "Creditos: " + creditos + "\n" + "Docente: " + Professor.getNomeString();
    }
}