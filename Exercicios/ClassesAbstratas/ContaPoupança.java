package ClassesAbstratas;

public class ContaPoupança extends ContaAbstrata{
    private double rendimento;

    @Override
    public void Sacar(double pSaque){
        this.saldo = this.saldo - pSaque;
        this.rendimento = 0;
    }
}
