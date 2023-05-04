
public class Pessoa{
    protected Data nascimentoData;
    protected String nomeString, emailString, enderecoString;
    protected String cpfInt;

    //Construtores
    public Pessoa (String nome, String email, String cpf, String endereco,int dia, int mes, int ano){
        nomeString = nome;
        emailString = email;
        cpfInt = cpf;
        enderecoString = endereco;
        nascimentoData = new Data(dia, mes, ano);
    }

    public Pessoa (String nome, String email, String cpf, Data data){
        nomeString =  nome;
        emailString = email;
        cpfInt = cpf;
        nascimentoData = data;        
    }

    //Gette's and Sette's
    public Data getNascimentoData() {
        return nascimentoData;
    }

    public void setNascimentoData(Data nascimentoData) {
        this.nascimentoData = nascimentoData;
    }

    public String getNomeString() {
        return nomeString;
    }

    public void setNomeString(String nomeString) {
        this.nomeString = nomeString;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public String getCpfInt() {
        return cpfInt;
    }

    public void setCpfInt(String cpfInt) {
        this.cpfInt = cpfInt;
    }
    
    @Override
    public String toString (){
        return "Nome: " + nomeString + "\n" + "E-mail: " + emailString + "CPF: " + cpfInt + "\n"
         + nascimentoData.infoDateExt();
    }
}