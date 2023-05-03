package InterfaceGrafica;

public class ContaUI {
    protected String  titular;
    protected int     agencia;
    protected int     numero;
    protected double  saldo = 100.0;

    ContaUI()
    {
        System.out.println("Conta1");
        titular         = "Novo titular";
        agencia         = 1;
        numero          = 1;
        saldo           = 200.0;    
    }
    
    ContaUI(String pNomeTitular, int pAgencia, 
          int pNumero, double pValor)       
    {
        System.out.println("Conta2");
        titular         = pNomeTitular;
        agencia         = pAgencia;
        numero          = pNumero;
        saldo           = pValor;
    }    
    
    public void setNomeTitular(String nomeTitular) {
        this.titular = nomeTitular;
    }
    public String getNomeTitular() {
        return titular;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }   
    public void setNumero(int numero) {
        this.numero = numero;
    }    
    public int getNumero() {
        return numero;
    }   
    public Double getSaldo()
    {
        return saldo;
    }
    public void setValor(Double pSaldo)
    {
        if (pSaldo >= 0)
            this.saldo = pSaldo;
    }
    
    public void Depositar(Double pValor)
    {
        this.saldo = this.saldo + pValor; 
    }
    
    public void Sacar(Double pValor)
    {
        if (pValor < this.saldo)
            this.saldo = this.saldo - pValor; 
    }   

    void imprimir()
    {
        System.out.println(" -- Classe Conta : Imprimir -- ");
        System.out.println(" Titular : " + this.titular);
        System.out.println(" Agência : " + this.agencia);
        System.out.println(" Número  : " + this.numero);
        System.out.println(" Valor   : " + this.saldo);        
    }    
    

}
