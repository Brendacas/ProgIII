import java.util.Scanner;
public class Motorista {
    public String nome;
    public String placa;
    public String modelo;
    public int numViagens;
    private double avaliacao;
   
    Scanner scan = new Scanner(System.in);

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNumViagens(int numViagens) {
        this.numViagens = numViagens;
    }
    public int getNumViagens() {
        return numViagens;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }


    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    public double getAvaliacao() {
        return avaliacao;
    }

    Motorista(){
        System.out.println("Criando Construtor vazio");

    }
    Motorista(String motorista, String placaVeiculo, String modeloCarro){
        this.nome = motorista;
        this.placa = placaVeiculo;
        this.modelo = modeloCarro;
        this.numViagens = 0;
        this.avaliacao = 5.0;

        System.out.println("Criando Construtor com Parametros");
    }
    public void realizarViagem() {
        this.numViagens ++;
    }
    public void registraNovaViagem(double avaliacao) {
        int novoNumViagens = this.numViagens + 1;
        double novaAvaliacao = (this.avaliacao * this.numViagens + avaliacao) / novoNumViagens;
        this.numViagens = novoNumViagens;
        this.avaliacao = novaAvaliacao;
    }
    

    public void imprimirMotorista(){
        System.out.println("Nome do motorista: " + nome);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Avaliacao do motorisat: " + avaliacao);
        System.out.println("Viagesn realizadas: " + numViagens);
    
    }
    public void lerMotorista(){
        System.out.println("Nome do motorista: ");
        String nome = scan.nextLine();
        System.out.println("Modelo do carro: " );
        String modelo = scan.nextLine();
        System.out.println("Placa do carro: " );
        String placa = scan.nextLine();

        scan.close();
    }

    

}
