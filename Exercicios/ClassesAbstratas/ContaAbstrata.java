package ClassesAbstratas;

public class ContaAbstrata {
    protected double saldo;

    public void Sacar(double pSaque){
        this.saldo = this.saldo - pSaque;
    }
}
