public class Conta {
    int ag;
    int numero;
    private float saldo;
    String titular;

    public void setAg(int ag) {
        this.ag = ag;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAg() {
        return ag;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void Depositar(float deposito){
        this.saldo = this.saldo + deposito;
    }
    
    public void Sacar(float saque){
        this.saldo = this.saldo - saque;
    }

    public void Imprimir(){
        System.out.printf("Numero: %d \n", this.numero);
        System.out.printf("Agencia: %d \n", this.ag);
        System.out.println("Saldo: " + this.saldo);
        System.out.printf("Titular: %s \n", this.titular);
        
    }

}
