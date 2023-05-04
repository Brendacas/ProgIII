
abstract class Disciplina {
    protected String nomeDisciplina, codigoDisciplina;
    protected float[] notas;
    protected int cargaHoraria, creditos = 0;
    private static int cont = 0;
    
    // construtor
    public Disciplina(String nomeDisciplina, String codigoDisciplina,  int creditos, int cargaHoraria) {
       
    
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
    public float[] getNotas(){
        return notas;
    }

    // setter's
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public void setNotas(float[] notas){
        this.notas = notas;
    }



    //Métodos
    private boolean verificarCreditos() {
        if (creditos > 0) return true;
        else return false;
    }

    public void adicionaNota (float nota){
        if(cont <= creditos) notas[cont++] = nota;
    }
    
    protected boolean calcularMedia(float[] notas, int creditos) {
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
        return false;
    }
  

   /*  public String toString (){
        return "Cod: " + codigoDisciplina + " Disciplina " + nomeDisciplina + " C/Horaria: " + cargaHoraria +
        "Creditos: " + creditos + "\n" + "Docente: " + Professor.getNomeString();
    }*/
}